package org.hypertrace.semantic.convention.utils.rpc;

/**
 * OTel rpc attributes
 */
public enum OTelRpcSemanticConventions {
  RPC_SYSTEM("rpc.system"),
  RPC_METHOD("rpc.method"),
  GRPC_STATUS_CODE("rpc.grpc.status_code"),
  RPC_SYSTEM_VALUE_GRPC("grpc"),
  RPC_SYSTEM_VALUE_JAVA_RMI("java_rmi"),
  RPC_SYSTEM_VALUE("wcf");

  private final String value;

  OTelRpcSemanticConventions(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }
}
