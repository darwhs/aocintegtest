package com.amazon.aocagent.testamis;

import com.amazon.aocagent.enums.S3Package;

public class Ubuntu extends DebianAMI {
  @Override
  public String getAMIId() {
    return "ami-003634241a8fcdec0";
  }

  @Override
  public String getLoginUser() {
    return "ubuntu";
  }

  @Override
  public S3Package getS3Package() {
    return S3Package.DEBIAN_AMD64_DEB;
  }
}
