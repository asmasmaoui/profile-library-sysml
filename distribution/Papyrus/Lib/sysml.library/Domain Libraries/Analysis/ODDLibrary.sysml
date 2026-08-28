library package ODD_Enumerations {
    private import ScalarValues::*;

    enum def SectionType {
        enum INCLUDE_AND;
        enum INCLUDE_OR;
        enum EXCLUDE_AND;
        enum EXCLUDE_OR;
    }

    enum def ExportInstruction {
        enum FILE;
        enum DB;
        enum SERVICE;
    }
}

library package ODD_DataTypes {
    private import ScalarValues::*;

    attribute def LangString {
        attribute value    : String;
        attribute intlCode : String;
    }
}

library package ODD_Units {
    private import MeasurementReferences::*;
    public import ISQ::*;
    public import SI::*;

    abstract attribute def PrecipitationRateUnit :> MeasurementUnit;
    attribute <'m/s_precip'> precipitation_intensity : PrecipitationRateUnit;
    attribute <'mm/h'> millimetre_per_hour : PrecipitationRateUnit {
        :>> unitConversion: ConversionByConvention {
            :>> referenceUnit = precipitation_intensity;
            :>> conversionFactor = 3600000.0;
        }
    }

    abstract attribute def RiskUnit :> MeasurementUnit;
    attribute <'risk'> risk : RiskUnit;

    abstract attribute def DataRateUnit :> MeasurementUnit;
    attribute <'bit/s'> bit_per_second : DataRateUnit;
    attribute <'Mbps'> megabit_per_second : DataRateUnit {
        :>> unitConversion: ConversionByConvention {
            :>> referenceUnit = bit_per_second;
            :>> conversionFactor = 1000000.0;
        }
    }

    abstract attribute def SpeedUnit :> MeasurementUnit;
    attribute <'m/s'> metre_per_second : SpeedUnit;
    attribute <'ft/s'> foot_per_second : SpeedUnit {
        :>> unitConversion: ConversionByConvention {
            :>> referenceUnit = metre_per_second;
            :>> conversionFactor = 0.3048;
        }
    }

    abstract attribute def LengthUnit :> MeasurementUnit;
    attribute <'m'> metre : LengthUnit;
    attribute <'ft'> foot : LengthUnit {
        :>> unitConversion: ConversionByConvention {
            :>> referenceUnit = metre;
            :>> conversionFactor = 0.3048;
        }
    }

    abstract attribute def OccurrenceRateUnit :> MeasurementUnit;
    attribute <'occ/s'> occurrence_per_second : OccurrenceRateUnit;
    attribute <'occ/hr'> occurrence_per_hour : OccurrenceRateUnit {
        :>> unitConversion: ConversionByConvention {
            :>> referenceUnit = occurrence_per_second;
            :>> conversionFactor = 1.0/3600.0;
        }
    }
}

library package ODD_Taxonomy {
    public import ScalarValues::*;
    private import ODD_DataTypes::*;
    private import ODD_Enumerations::*;
    private import MeasurementReferences::*;

    package Taxonomy {

        abstract part def TaxonomyConcept {
            attribute id                  : String[0..1];
            attribute name                : ODD_DataTypes::LangString[0..*];
            attribute description         : ODD_DataTypes::LangString[0..1];
            attribute comments            : ODD_DataTypes::LangString[0..1];
            attribute export_instructions : ODD_Enumerations::ExportInstruction[0..1];
        }

        abstract part def SceneryElement         :> Container;
        abstract part def EnvironmentalCondition :> Container;
        abstract part def DynamicElement         :> Container;

        abstract part def Type :> TaxonomyConcept;

        part def Container :> TaxonomyConcept {
            part children    : TaxonomyConcept[0..*];
            part expressions   : Expression[0..*];
            attribute literals : LiteralList[0..*];
            attribute property : ScalarValue[0..*];
        }

        part def Record :> Type {
            part attributes : Field[1..*];
        }

        part def Expression {
            attribute name : ODD_DataTypes::LangString[0..*];
            abstract constraint expression;
        }

        attribute def Literal;

        attribute def LiteralList {
            attribute id                  : String[0..1];
            attribute name                : ODD_DataTypes::LangString[0..*];
            attribute description         : ODD_DataTypes::LangString[0..1];
            attribute comments            : ODD_DataTypes::LangString[0..1];
            attribute export_instructions : ODD_Enumerations::ExportInstruction[0..1];
        }

        part def Field {
            attribute id                  : String[0..1];
            attribute name                : ODD_DataTypes::LangString[0..*];
            attribute export_instructions : ODD_Enumerations::ExportInstruction[0..1];
            ref part  attributeType       : Type[0..1];
            attribute literalListType       : LiteralList[0..1];
        }

        part def Taxonomy {
            attribute id          : String[0..1];
            attribute name        : ODD_DataTypes::LangString[0..*];
            attribute affiliation : String[0..1];
            part taxonomyConcepts : TaxonomyConcept[0..*];
        }
       
       
    }
}

library package ODD_Module {
    private import ScalarValues::*;
    private import SequenceFunctions::*;
    private import BooleanFunctions::*;
    private import DataFunctions::*;
    private import NumericalFunctions::*;
    private import ODD_DataTypes::*;
    private import ODD_Taxonomy::*;
    private import ODD_Taxonomy::Taxonomy::*;
    private import ODD_Enumerations::*;

    part def Tag {
        attribute name : LangString[0..*];
    }

    part def Label {
        attribute id : String[0..1];
    }

    part def Condition {
        attribute description      : LangString[0..*];
        attribute comments         : LangString[0..*];
        ref part  taxonomyConcept  : TaxonomyConcept[0..1];
        ref part  referencedModule : Module[0..1];
        ref part  referencedLabel  : Label[0..1];
        ref part  expression         : Expression[0..1];
        attribute literalListValue   : LiteralList[0..1];
        constraint condition;
    }

    abstract part def Section {
        attribute sectionType  : SectionType;
        part conditions        : Condition[0..*];
        constraint sectionConstraint;
        part nestedSections    : Section[0..*];
    }

    abstract part def IncludeSection :> Section { }
    abstract part def ExcludeSection :> Section { }

    part def IncludeAndSection :> IncludeSection {
        constraint { sectionType == SectionType::INCLUDE_AND }
    }
    part def IncludeOrSection :> IncludeSection {
        constraint { sectionType == SectionType::INCLUDE_OR }
    }
    part def ExcludeAndSection :> ExcludeSection {
        constraint { sectionType == SectionType::EXCLUDE_AND }
    }
    part def ExcludeOrSection :> ExcludeSection {
        constraint { sectionType == SectionType::EXCLUDE_OR }
    }

    part def Module {
        attribute id                  : String[0..1];
        attribute title               : LangString[0..*];
        attribute is_root             : Boolean;
        attribute is_active           : Boolean = true;
        attribute description         : LangString[0..1];
        attribute comments            : LangString[0..1];
        attribute export_instructions : ExportInstruction[0..1];
        part includeSection : IncludeSection[0..1];
        part excludeSection : ExcludeSection[0..1];
        constraint atLeastOneSection {
            notEmpty(includeSection) | notEmpty(excludeSection)
        }
        ref part labels : Label[0..*];
        part tags       : Tag[0..*];
    }
    
}