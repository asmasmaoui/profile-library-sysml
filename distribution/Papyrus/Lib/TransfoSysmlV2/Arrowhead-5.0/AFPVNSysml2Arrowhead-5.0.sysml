import ScalarValues::*;
import ISQBase::*;
import AFPVNDatatypes::*;
import ArrowheadProfile::*;
part def ServiceRegister_Design {@SysD;
port ServiceDiscovery:ServiceDiscovery{@FullPort;}

port ServiceManagement:ServiceManagement{@FullPort;}

port SysMonitor:SysMonitor{@FullPort;}
}
port def ServiceDiscovery { @SD;


 }

port def ServiceManagement { @SD;





 }

part def ServiceRegister_DesignDescription:>ServiceRegister_Design {@SysDD;
port ServiceDiscoveryHTTP:ServiceDiscoveryHTTP{@ProxyPort;}

port SysMonitorMQTT{@ProxyPort;}

port ServiceManagementHTTP:ServiceManagementHTTP{@ProxyPort;}
}
port def ServiceDiscoveryHTTP:>ServiceDiscovery { @IDD; }

port def ServiceManagementHTTP:>ServiceManagement { @IDD; }

port def SysMonitor { @SD;


 }

port def SysMonitorMQTT:>SysMonitor { @IDD; }

part def ServiceOrchestrationDesign {@SysD;
port ServiceDiscovery:ServiceDiscovery{@FullPort;}

port ServiceOrchestration:ServiceOrchestration{@FullPort;}

port OchestrationStoreManagement:OrchestrationStoreManagement{@FullPort;}

port SysMonitor:SysMonitor{@FullPort;}
}
port def ServiceOrchestration { @SD;

 }

port def OrchestrationStoreManagement { @SD;






 }

port def ServiceOrchestrationHTTP:>ServiceOrchestration { @IDD; }

port def OrchestrationStoreManagementHTTP:>OrchestrationStoreManagement { @IDD; }

part def ServiceOrchestrationDesignDescription:>ServiceOrchestrationDesign {@SysDD;
port ServiceDiscoveryHTTP:ServiceDiscoveryHTTP{@ProxyPort;}

port ServiceOrchestrationHTTP:ServiceOrchestrationHTTP{@ProxyPort;}

port OrchestrationStoreManagementHTTP:OrchestrationStoreManagementHTTP{@ProxyPort;}

port SysMonitorMQTT:SysMonitorMQTT{@ProxyPort;}
}
part def MicrosystemMonitorDesign {@SysD;
port ServiceDiscovery:ServiceDiscovery{@FullPort;}

port ServiceOrcehstration:ServiceOrchestration{@FullPort;}

port SysMonitor:SysMonitor{@FullPort;}

port GetPublicKey:GetPublicKey{@FullPort;}

port ConsumerAuthentication:ConsumerAuthentication{@FullPort;}

port SysMonitorData:SysMonitorData{@FullPort;}
}
part def ConsumptionAuthorisationDesign {@SysD;
port ServiceDiscovery:ServiceDiscovery{@FullPort;}

port ServiceOrchestration:ServiceOrchestration{@FullPort;}

port GetPublicKey:GetPublicKey{@FullPort;}

port AuthorisationManagement:AuthorisationManagement{@FullPort;}

port TokenGeneration:TokenGeneration{@FullPort;}

port SysMonitor:SysMonitor{@FullPort;}
}
port def TokenGeneration { @SD;
 }

port def GetPublicKey { @SD;
 }

port def AuthorisationManagement { @SD;







 }

port def TokenGenerationHTTP:>TokenGeneration { @IDD; }

port def GetPublicKeyHTTP:>GetPublicKey { @IDD; }

port def AuthorisationManagementHTTP:>AuthorisationManagement { @IDD; }

part def ConsumptionAuthorisation_DesignDescription:>ConsumptionAuthorisationDesign {@SysDD;
port GetPublicKeyHTTP:GetPublicKeyHTTP{@ProxyPort;}

port TokenGenerationHTTP:TokenGenerationHTTP{@ProxyPort;}

port AuthorisationManagementHTTP:AuthorisationManagementHTTP{@ProxyPort;}

port ServiceDiscoveryHTTP:ServiceDiscoveryHTTP{@ProxyPort;}

port ServiceOrchestrationHTTP:ServiceOrchestrationHTTP{@ProxyPort;}

port SysMonitorMQTT:SysMonitorMQTT{@ProxyPort;}
}
part def MicrosystemMonitorDesignDescription:>MicrosystemMonitorDesign {@SysDD;
port SysMonitorMQTT:SysMonitorMQTT{@ProxyPort;}

port ServiceDiscoveryHTTP:ServiceDiscoveryHTTP{@ProxyPort;}

port ServiceOrchestrationHTTP:ServiceOrchestrationHTTP{@ProxyPort;}

port GetPubliícKeyHTTP{@ProxyPort;}

port ConsumerAuthenticationHTTP:ConsumerAuhtenticationHTTP{@ProxyPort;}

port SysMonitorDataMQTT:SysMonitorDataMQTT{@ProxyPort;}
}
part def GatekeeperDesign {@SysD;
port ServiceDiscovery:ServiceDiscovery{@FullPort;}

port ServiceOrchestration:ServiceOrchestration{@FullPort;}

port GetPublicKey:GetPublicKey{@FullPort;}

port GlobalServiceDiscovery:GlobalServiceDiscovery{@FullPort;}

port InterCloudNegotiation:InterCloudNegotiation{@FullPort;}

port GatekeeperManagement:GateKeeperManagement{@FullPort;}

port ConsumerAuthentication:ConsumerAuthentication{@FullPort;}

port SysMonitor:SysMonitor{@FullPort;}
}
part def GenericApplicationSystemADesign {@SysD;
port MicroseerviceA:MicroserviceA{@FullPort;}

port MicroserviceB:MicroserviceB{@FullPort;}

port SysMonitor:SysMonitor{@FullPort;}

port ServiceDiscovery:ServiceDiscovery{@FullPort;}

port ServiceOrchestration:ServiceOrchestration{@FullPort;}

port GetPublicKey:GetPublicKey{@FullPort;}

port ConsumerAuthentication:ConsumerAuthentication{@FullPort;}

port gtconnectconsumer:gtconnectconsumer
}
port def MicroserviceA { @SD;
 }

port def MicroserviceB { @SD;
 }

part def GenericApplicationSystemBDesign {@SysD;
port MicroserviceB:MicroserviceB{@FullPort;}

port MicroserviceA:MicroserviceA{@FullPort;}

port ServiceDisvocery:ServiceDiscovery{@FullPort;}

port ServiceOrchestration:ServiceOrchestration{@FullPort;}

port GetPublicKey:GetPublicKey{@FullPort;}

port SysMonitor:SysMonitor{@FullPort;}

port ConsumerAuthentication:ConsumerAuthentication{@FullPort;}
}
port def MicroserviceAHTTP:>MicroserviceA { @IDD; }

port def MicroserviceBHTTP:>MicroserviceB { @IDD; }

port def GlobalServiceDiscovery { @SD;
 }

port def GlobalServiceDiscoveryHTTP:>GlobalServiceDiscovery { @IDD; }

port def InterCloudNegotiation { @SD;
 }

port def GateKeeperManagement { @SD;











 }

port def InterCloudNegotiationHTTP:>InterCloudNegotiation { @IDD; }

port def GateKeeperManagementHTTP:>GateKeeperManagement { @IDD; }

part def GateKeeperDesignDescription:>GatekeeperDesign {@SysDD;
port ServiceDiscovery_HTTP{@ProxyPort;}

port GetPubliucKey_HTTP{@ProxyPort;}

port ServiceOrchestrationHTTP{@ProxyPort;}

port GlobalServiceDiscoveryHTTP:GlobalServiceDiscoveryHTTP{@ProxyPort;}

port InterCloudNegotiationHTTP:InterCloudNegotiationHTTP{@ProxyPort;}

port GateKeeperManagementHTTP:GateKeeperManagementHTTP{@ProxyPort;}

port ConsumerAuthenticationHTTP:ConsumerAuhtenticationHTTP{@ProxyPort;}

port SysMonitorMQTT:SysMonitorMQTT{@ProxyPort;}
}
part def GatekeeperImplementation:>GateKeeperDesignDescription {@System_Implementation;}
port def GlobalServiceDiscoveryImplementation:>GlobalServiceDiscoveryHTTP { @IDD_Implementation; }

part def GeneericAIToolDesign {@SysD;
action def ExecuteToolA
action def TrainTool
port AlgorithmXServiceInterface:AlgorithmXServiceInterface{@FullPort;}

port SysMonitor:SysMonitor{@FullPort;}

port ServiceDiscovery:ServiceDiscovery{@FullPort;}

port GetPublicKey:GetPublicKey{@FullPort;}

port ServiceOrchestration{@FullPort;}

attribute AlgorithmA:Word2Vec;
}
port def AlgorithmXServiceInterface { @SD;

 }

part def AlgorithmX {@Block;
action def AlgorithmXcode}
part def DataSet {@SysD;
port ReadDataSet{@FullPort;}

port ServiceDiscovery:ServiceDiscovery{@FullPort;}

port GetPublicKey:GetPublicKey{@FullPort;}

port ServiceOrchestration:ServiceOrchestration{@FullPort;}

port Monitor:SysMonitor{@ProxyPort;}

attribute DataSet:DataSetA;
}
port def ReadDataSet { @SD;
 }

port def ReadDataSetWebsocket:>ReadDataSet { @IDD; }

part def DataSetA {@Block;
attribute Description:String;
}
part def DataSetDesignDesccription:>DataSet {@SysDD;
port ReadDataSetWebsocket:ReadDataSetWebsocket{@ProxyPort;}

port ServiceDiscoveryHTTP:ServiceDiscoveryHTTP{@ProxyPort;}

port GetPublicKeyHTTP:GetPublicKey{@ProxyPort;}

port ServiceOrchestrationHTTP:ServiceOrchestrationHTTP{@ProxyPort;}

port MonitorMQTT{@ProxyPort;}
}
part def System_Implementation26:>ServiceRegister_DesignDescription {@System_Implementation;}
part def AuthenticationDesign {@SysD;
port ConsumerAuthentication:ConsumerAuthentication{@FullPort;}

port ServiceDiscovery:ServiceDiscovery{@FullPort;}

port ServiceOrcehstration:ServiceOrchestration{@FullPort;}

port GetPublicKey:GetPublicKey{@FullPort;}

port SysMonitor:SysMonitor{@FullPort;}
}
port def ConsumerAuthentication { @SD; }

part def Word2Vec {@Block;
attribute URL:String;
}
part def SysD3 {@SysD;}
part def GateTunnelDesign {@SysD;
port gtconnectconsumer:gtconnectconsumer{@FullPort;}

port gtconnectprovider:gtconnectprovider{@FullPort;}

port gtclosesession:gtclosesession{@FullPort;}

port ServiceDiscovery:ServiceDiscovery{@FullPort;}

port GetPublicKey:GetPublicKey{@FullPort;}

port ServiceOrchestration:ServiceOrchestration{@FullPort;}

port SysMonitor:SysMonitor{@FullPort;}

port ConsumerAuthentication:ConsumerAuthentication{@FullPort;}

port SysMonitor:SysMonitor{@FullPort;}
}
port def gtconnectconsumer { @SD;
 }

port def gtconnectprovider { @SD;
 }

port def gtconnectconsumerHTTP:>gtconnectconsumer { @IDD; }

port def gtconnectproviderHTTP:>gtconnectprovider { @IDD; }

port def gtclosesession { @SD;
 }

port def gtclosesessionHTTP:>gtclosesession { @IDD; }

part def GateTunnelDesignDescription:>GateTunnelDesign {@SysDD;
port gtconnectconsumerHTTP:gtconnectconsumerHTTP{@ProxyPort;}

port gtconnectproducerHTTP:gtconnectproviderHTTP{@ProxyPort;}

port gtclosesessionHTTP:gtclosesessionHTTP{@ProxyPort;}

port SysMonitorMQTT:SysMonitorMQTT{@ProxyPort;}

port ServiceDiscoveryHTTP:ServiceDiscoveryHTTP{@ProxyPort;}

port ServiceOrchestrationHTTP:ServiceOrchestrationHTTP{@ProxyPort;}

port GetPublicKeyHTTP:GetPublicKeyHTTP{@ProxyPort;}

port ConsumerAuthneticationHTTP{@ProxyPort;}

port SysMonitorMQTT:SysMonitorMQTT{@ProxyPort;}
}
part def CertificateAuthorityDesign {@SysD;
port CheckCertificate:CheckCertificate{@FullPort;}

port ServiceDiscovery{@FullPort;}

port ServiceOrchestration{@FullPort;}

port GetPublicKey{@FullPort;}

port CertificateManagement:CertificateManagement{@FullPort;}
}
port def CertificateManagement { @SD; }

port def CheckCertificate { @SD;

 }

port def CertificateManagementHTTP:>CertificateManagement { @IDD; }

port def CheckCertificateHTTP:>CheckCertificate { @IDD; }

part def CertificatreAuthorityDesignDescription:>CertificateAuthorityDesign {@SysDD;
port ServiceDiscoveryHTTP{@ProxyPort;}

port ServiceOrchestrationHTTP:ServiceOrchestrationHTTP{@ProxyPort;}

port GetPublicKeyHTTP:GetPublicKeyHTTP{@ProxyPort;}

port CertificateManagement:CertificateManagementHTTP{@ProxyPort;}

port CheckCertificateHTTP:CheckCertificateHTTP{@ProxyPort;}
}
part def Topic {@Block;
action def Subscribe
action def Connect
action def Publish}
part def MQTTBrookerDesign {@Block;
port GatekeeperGatwayPort:Topic

port GateTunnelGatewayPort:Topic
}
part def TopicMQTT:>Topic {@Block;
action def ArrowHeadServiceInterfaceMQTT3{@ArrowHeadServiceInterfaceMQTT;}
action def ArrowHeadServiceInterfaceHTTP4{@ArrowHeadServiceInterfaceHTTP;}
attribute MQTT;}
part def MQTTBrookerDesingDescription:>MQTTBrookerDesign {@Block;
port Topic1MQTT:TopicMQTT

port Topic2MQTT:TopicMQTT
}
part def GenericSystemofLocalCloudsDesign {@System_of_LocalcloudsDesign;}
part def GenericSystemofLocacloudsDesignDescription:>GenericSystemofLocalCloudsDesign {@System_of_LocacloudsDesignDescription;}
part def GenericApplicationSystemADesignDescription:>GenericApplicationSystemADesign {@SysDD;
port MicroservviceAHTTP:MicroserviceAHTTP{@ProxyPort;}

port ServiceDiscoveryHTTP:ServiceDiscoveryHTTP{@ProxyPort;}

port ServiceOrchestrationHTTP:ServiceOrchestrationHTTP{@ProxyPort;}

port GetPublicKeyHTTP:GetPublicKeyHTTP{@ProxyPort;}

port ConsumerAuthenticationHTTP:ConsumerAuhtenticationHTTP{@ProxyPort;}

port SysMonitorMQTT:SysMonitorMQTT{@ProxyPort;}

port MicrosystemBHTTP:MicroserviceBHTTP{@ProxyPort;}
}
part def GenericApplicationSystemBDesignDescription:>GenericApplicationSystemBDesign {@SysDD;
port MicroserviceBHTTP:MicroserviceBHTTP{@ProxyPort;}

port ServiceDiscoveryHTTP:ServiceDiscoveryHTTP{@ProxyPort;}

port ServiceOrchestrationHTTP:ServiceOrchestrationHTTP{@ProxyPort;}

port GetPublicKeyHTTP:GetPublicKeyHTTP{@ProxyPort;}

port ConsumerAuthenticationHTTP:ConsumerAuhtenticationHTTP{@ProxyPort;}

port MicroserviceAHTTP:MicroserviceAHTTP{@ProxyPort;}

port SysMonitorMQTT:SysMonitorMQTT{@ProxyPort;}
}
port def ConsumerAuhtenticationHTTP:>ConsumerAuthentication { @IDD; }

part def AuthenticationDesignDescription:>AuthenticationDesign {@SysDD;
port ConsumerAuthenticationHTTP:ConsumerAuhtenticationHTTP{@ProxyPort;}

port ServiceDiscovery_HTTP:ServiceDiscoveryHTTP{@ProxyPort;}

port GetPubliucKey_HTTP:GetPublicKeyHTTP{@ProxyPort;}

port ServiceOrchestrationHTTP:ServiceOrchestration{@ProxyPort;}

port SysMonitorMQTT:SysMonitorMQTT{@ProxyPort;}
}
port def SysMonitorData { @SD;
 }

port def SysMonitorDataMQTT:>SysMonitorData { @IDD; }

part def GegnericAIToolDwsignDescrciption:>GeneericAIToolDesign {@SysDD;}
part def PrototAIP {@SysD;}
port def null { @SD; }

part def GenericLocalCloud {@Block;
port GatekeeperGatewayPort{@FullPort;}

port GateTunnelGatewayPort{@FullPort;}

attribute serviceRegister_Design:ServiceRegister_Design;

attribute serviceOrchestrationDesign:ServiceOrchestrationDesign;

attribute consumptionAuthorisationDesign:ConsumptionAuthorisationDesign;

attribute authenticationDesign:AuthenticationDesign;

attribute gatekeeperDesign:GatekeeperDesign;

attribute gateTunnelDesign:GateTunnelDesign;

attribute microsystemMonitorDesign:MicrosystemMonitorDesign;

attribute genericApplicationSystemADesign:GenericApplicationSystemADesign;

attribute geneericAIToolDesign:GeneericAIToolDesign;

attribute mQTTBrookerDesign:MQTTBrookerDesign;

connect gateTunnelDesign.SysMonitor to mQTTBrookerDesign.GatekeeperGatwayPort;

connect microsystemMonitorDesign.SysMonitor to mQTTBrookerDesign.GatekeeperGatwayPort;

connect microsystemMonitorDesign.SysMonitorData to mQTTBrookerDesign.GateTunnelGatewayPort;

binding BindingConnector16 bind gateTunnelDesign.gtconnectconsumer = GateTunnelGatewayPort;

binding BindingConnector17 bind gateTunnelDesign.gtclosesession = GateTunnelGatewayPort;

binding BindingConnector18 bind gateTunnelDesign.gtconnectprovider = GateTunnelGatewayPort;

binding BindingConnector19 bind gatekeeperDesign.GlobalServiceDiscovery = GatekeeperGatewayPort;

binding BindingConnector20 bind gatekeeperDesign.InterCloudNegotiation = GatekeeperGatewayPort;

connect serviceRegister_Design.ServiceDiscovery to genericApplicationSystemADesign.ServiceDiscovery;

connect geneericAIToolDesign.ServiceDiscovery to serviceRegister_Design.ServiceDiscovery;

connect consumptionAuthorisationDesign.ServiceOrchestration to genericApplicationSystemADesign.ServiceOrchestration;

connect authenticationDesign.GetPublicKey to genericApplicationSystemADesign.GetPublicKey;
}
part def GenericSystem_of_LocalClouds {@Block;
attribute genericLocalCloudA:GenericLocalCloud;

attribute genericLocalCloud0:GenericLocalCloud;

attribute mQTTBrookerDesign:MQTTBrookerDesign;

connect genericLocalCloudA.GateTunnelGatewayPort to mQTTBrookerDesign.GatekeeperGatwayPort;

connect genericLocalCloudA.GatekeeperGatewayPort to mQTTBrookerDesign.GatekeeperGatwayPort;

connect genericLocalCloud0.GateTunnelGatewayPort to mQTTBrookerDesign.GateTunnelGatewayPort;

connect genericLocalCloud0.GatekeeperGatewayPort to mQTTBrookerDesign.GateTunnelGatewayPort;
}
