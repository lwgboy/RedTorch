/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.api.jctp.trader;

public class CThostFtdcEWarrantOffsetField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcEWarrantOffsetField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcEWarrantOffsetField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctptraderapiv6v3v11x64JNI.delete_CThostFtdcEWarrantOffsetField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradingDay(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcEWarrantOffsetField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcEWarrantOffsetField_TradingDay_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcEWarrantOffsetField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcEWarrantOffsetField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcEWarrantOffsetField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcEWarrantOffsetField_InvestorID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcEWarrantOffsetField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcEWarrantOffsetField_ExchangeID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcEWarrantOffsetField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcEWarrantOffsetField_InstrumentID_get(swigCPtr, this);
  }

  public void setDirection(char value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcEWarrantOffsetField_Direction_set(swigCPtr, this, value);
  }

  public char getDirection() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcEWarrantOffsetField_Direction_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcEWarrantOffsetField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcEWarrantOffsetField_HedgeFlag_get(swigCPtr, this);
  }

  public void setVolume(int value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcEWarrantOffsetField_Volume_set(swigCPtr, this, value);
  }

  public int getVolume() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcEWarrantOffsetField_Volume_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcEWarrantOffsetField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcEWarrantOffsetField_InvestUnitID_get(swigCPtr, this);
  }

  public CThostFtdcEWarrantOffsetField() {
    this(jctptraderapiv6v3v11x64JNI.new_CThostFtdcEWarrantOffsetField(), true);
  }

}