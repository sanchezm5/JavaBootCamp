package com.company.MariaSanchezU1Capstone.dao;

import com.company.MariaSanchezU1Capstone.models.ProcessingFee;
import org.apache.tomcat.jni.Proc;

import java.util.List;

public interface ProcessingFeeDao {

    ProcessingFee getProcessingFee(String productType);
}
