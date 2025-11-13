import ScalarValues::*;
import ISQBase::*;
import AFPVNDatatypes::*;
import ArrowheadProfile::*;
part def ControlerVer1 {@SysD;
port lampLight:lampLight{@FullPort;}

port precenseSensor:presenceSensorV1{@FullPort;}

port sysMonitor{@FullPort;}

port serviceDiscovery{@FullPort;}

port serviceOrchestration{@FullPort;}

port identify{@FullPort;}

port autohrisatiion{@FullPort;}

port handover:handover{@FullPort;}
}
port def presenceSensorV1 { @SD;

 }

port def lampLight { @SD;
 }

port def lampLightHTTP:>lampLight { @IDD; }

part def StreetLight {@SysD;
port lampLight:lampLight{@FullPort;}

port sysMonitor{@FullPort;}

port serviceDiscovery{@FullPort;}

port serviceOrchestration{@FullPort;}

port identify{@FullPort;}

port autohrisatiion{@FullPort;}
}
part def StreetLight:>StreetLight {@SysDD;
port lampLightHTTP:lampLightHTTP{@FullPort;}

port sysMonitorAMQP{@FullPort;}

port serviceDiscoveryHTTP{@FullPort;}

port serviceOrchestrationHTTP{@FullPort;}

port identifyHTTP{@FullPort;}

port authorisationHTTP{@FullPort;}
}
part def PrecenseDetectionV1 {@SysD;
port precenseSensor:presenceSensorV1{@FullPort;}

port sysMonitor{@FullPort;}

port serviceDiscovery{@FullPort;}

port serviceOrchestration{@FullPort;}

port identify{@FullPort;}

port autohrisatiion{@FullPort;}
}
part def PrecenseDetectionV1:>PrecenseDetectionV1 {@SysDD;
port servcieDiscoveryHTTP{@FullPort;}

port serviceOrchestrationHTTP{@FullPort;}

port identifyHTTP{@FullPort;}

port authorisationHTTP{@FullPort;}

port sysMonitorAMQP{@FullPort;}

port precenseSensorHTTP:precenseSensorHttpV1{@FullPort;}
}
part def ControlerVer1:>ControlerVer1 {@SysDD;
port serviceOrchestrationHTTP{@FullPort;}

port identifyHTTP{@FullPort;}

port authorisationTokenHTTP{@FullPort;}

port sysMonitorAMQP{@FullPort;}

port serviceDiscoveryHTTP{@FullPort;}

port lampLightHTTP:lampLightHTTP{@FullPort;}

port precenseSensorHTTP:precenseSensorHttpV1{@FullPort;}

port handoverHttp:handoverHttp{@FullPort;}
}
part def ControlerVer2 {@SysD;
port lampLight:lampLight{@FullPort;}

port precenseSensor:presenceSensorV1{@FullPort;}

port sysMonitor{@FullPort;}

port serviceDiscovery{@FullPort;}

port serviceOrchestration{@FullPort;}

port identify{@FullPort;}

port autohrisatiion{@FullPort;}

port precenseSensorV2:presenceSensorV2{@FullPort;}

port sysMonitor{@FullPort;}
}
part def ControlerVer2:>ControlerVer1 {@SysDD;
port serviceOrchestrationHTTP

port identifyHTTP

port authorisationTokenHTTP

port sysMonitorAMQP

port serviceDiscoveryHTTP

port lampLightHTTP:lampLightHTTP

port precenseSensorHTTP

port precenseSensorHttpV2:precenseSensorHttpV2{@FullPort;}
}
part def CityBlockGen1 {@LocalCloudDesign;
attribute ServiceRegistrty;
attribute ServiceOrchestration;
attribute Authentication;
attribute GatekeeperX;
attribute GateTunnelY;
port globalServiceDiscovery

attribute ConsumerAuthorization;
attribute SL1:StreetLight;

attribute C1:ControlerVer1;

attribute PS1:PrecenseDetectionV1;

attribute SL2:StreetLight;

attribute C2:ControlerVer1;

attribute PS2:PrecenseDetectionV1;

attribute CopyOf_SL2_19:StreetLight;

attribute CopyOf_PS2_19:PrecenseDetectionV1;

attribute CopyOf_C2_19:ControlerVer1;

connect SL1.lampLight to C1.lampLight;

connect PS1.precenseSensor to C1.precenseSensor;

connect C2.lampLight to SL2.lampLight;

connect C2.precenseSensor to PS2.precenseSensor;

connect C1.handover to C2.handover;

connect ServiceRegistrty to SL1.serviceDiscovery;
}
port def precenseSensorImplV1:>precenseSensorHttpV1 { @IDD_Implementation; }

part def PrecenseDetectionV1:>PrecenseDetectionV1 {@System_Implementation;
port precenseSensorImpl:precenseSensorImplV1{@FullPort;}
}
port def lampLightImpl:>lampLightHTTP { @IDD_Implementation; }

part def StreetLight:>StreetLight {@System_Implementation;
port lampLightImpl:lampLightImpl{@FullPort;}
}
port def precenseSensorHttpV1:>presenceSensorV1 { @IDD; }

part def PrecenseDetectionV2 {@SysD;
port precenseSensorV2:presenceSensorV2{@FullPort;}

port sysMonitor{@FullPort;}
}
part def PrecenseDetectionV2:>PrecenseDetectionV2 {@SysDD;
port precenseSensorHttpV2:precenseSensorHttpV2{@FullPort;}
}
part def PrecenseDetectorV2:>PrecenseDetectionV2 {@System_Implementation;
port precenseSensorImplv2:precenseSensorImplV2{@FullPort;}
}
port def presenceSensorV2 { @SD;
 }

port def precenseSensorHttpV2:>presenceSensorV2 { @IDD; }

port def precenseSensorImplV2:>precenseSensorHttpV2 { @IDD_Implementation; }

part def PrecneseDetectionV3 {@SysD;
port precenseSensorV3:PrecneseDetectionV3{@FullPort;}

port serviceDiscovery{@FullPort;}

port serviceOrchestration{@FullPort;}

port identity{@FullPort;}

port authorization{@FullPort;}

port sysMonitor{@FullPort;}
}
part def PrecenseDetectionV3:>PrecneseDetectionV3 {@SysDD;
port sysMonitorAmqp{@FullPort;}

port precenseSensorMqttV3:precenseSensorMqttV3{@FullPort;}
}
part def PrecenseDetectionV3:>PrecenseDetectionV3 {@System_Implementation;
port precenseSensorImplV3:precenseSensorImplV3{@FullPort;}

port precenseSensorImplV3{@FullPort;}
}
port def presenceSensorV3 { @SD;
 }

port def precenseSensorMqttV3:>presenceSensorV3 { @IDD; }

port def precenseSensorImplV3:>precenseSensorMqttV3 { @IDD_Implementation; }

part def ControlerV3 {@SysD;
port lampLight:lampLight

port sysMonitor

port serviceDiscovery

port serviceOrchestration

port identify

port autohrisatiion

port sysMonitor

port precenseSensorV3:presenceSensorV3{@FullPort;}
}
part def ControlerV3:>ControlerVer1 {@SysDD;
port serviceOrchestrationHTTP

port identifyHTTP

port authorisationTokenHTTP

port sysMonitorAMQP

port serviceDiscoveryHTTP

port lampLightHTTP:lampLightHTTP

port precenseSensorHTTP

port precenseSensorHttpV2:precenseSensorHttpV2

port precenseSensorMqttV3:precenseSensorMqttV3{@FullPort;}
}
part def ControlerVer2:>ControlerVer2 {@System_Implementation;
port precenseSensorImplV2:precenseSensorImplV2{@FullPort;}
}
part def ControlerVer3:>ControlerV3 {@System_Implementation;
port precenseSensorImplV3:precenseSensorImplV3{@FullPort;}
}
part def LampPole {@DeviceDesign;
port IntracloudNetwork:LampPoleIntracloudNetwork{@FullPort;}
}
part def LampPole:>LampPole {@DeviceDesignDescription;
port IntracloudNetwork:LampPoleIntracloudNetwork{@FullPort;}
}
part def LampPoleIntracloudNetwork {@IntracloudNetworkDesign;}
part def LampPoleIntracloudNetwork:>LampPoleIntracloudNetwork {@IntracloudNetworkDesignDescription;}
part def LampPoleIntercloudNetwork {@IntercloudNetworkDesign;}
part def LampPoleIntercloudNetwork:>LampPoleIntercloudNetwork {@IntercloudNetworkDesignDescription;}
part def IntracloudDMZNetwork {@IntracloudNetworkDesignDescription;
port LamPoleDmzIntracloudNetwork:LampPoleIntracloudNetwork{@FullPort;}

port LampPoleIntercloudNetwork:LampPoleIntercloudNetwork{@FullPort;}
}
port def handover { @SD;
 }

port def handoverHttp:>handover { @IDD;

 }

port def handoverImpl:>handoverHttp { @IDD_Implementation; }

part def ControlerVer1:>ControlerVer1 {@System_Implementation;
port precenseSensor:precenseSensorImplV1{@FullPort;}

port lampLight:lampLightImpl{@FullPort;}

port handoverImpl:handoverImpl{@FullPort;}

port sysMonitor{@FullPort;}
}
part def StreetLight:>StreetLight {@System_Implementation;
port lampLightImpl:lampLightImpl{@FullPort;}

port sysMonitor{@FullPort;}
}
port def lampLightImpl:>lampLightHTTP { @IDD_Implementation; }

part def CityBlockGen1:>CityBlockGen1 {@LocalcloudDesignDescription;}
part def SysD1 {@SysD;}
