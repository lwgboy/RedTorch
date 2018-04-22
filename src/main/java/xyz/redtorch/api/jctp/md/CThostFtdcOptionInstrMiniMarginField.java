/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.api.jctp.md;

public class CThostFtdcOptionInstrMiniMarginField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcOptionInstrMiniMarginField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcOptionInstrMiniMarginField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctpmdapiv6v3v11x64JNI.delete_CThostFtdcOptionInstrMiniMarginField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setInstrumentID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcOptionInstrMiniMarginField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcOptionInstrMiniMarginField_InstrumentID_get(swigCPtr, this);
  }

  public void setInvestorRange(char value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcOptionInstrMiniMarginField_InvestorRange_set(swigCPtr, this, value);
  }

  public char getInvestorRange() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcOptionInstrMiniMarginField_InvestorRange_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcOptionInstrMiniMarginField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcOptionInstrMiniMarginField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcOptionInstrMiniMarginField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcOptionInstrMiniMarginField_InvestorID_get(swigCPtr, this);
  }

  public void setMinMargin(double value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcOptionInstrMiniMarginField_MinMargin_set(swigCPtr, this, value);
  }

  public double getMinMargin() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcOptionInstrMiniMarginField_MinMargin_get(swigCPtr, this);
  }

  public void setValueMethod(char value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcOptionInstrMiniMarginField_ValueMethod_set(swigCPtr, this, value);
  }

  public char getValueMethod() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcOptionInstrMiniMarginField_ValueMethod_get(swigCPtr, this);
  }

  public void setIsRelative(int value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcOptionInstrMiniMarginField_IsRelative_set(swigCPtr, this, value);
  }

  public int getIsRelative() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcOptionInstrMiniMarginField_IsRelative_get(swigCPtr, this);
  }

  public CThostFtdcOptionInstrMiniMarginField() {
    this(jctpmdapiv6v3v11x64JNI.new_CThostFtdcOptionInstrMiniMarginField(), true);
  }

}