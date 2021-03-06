// **********************************************************************
// This file was generated by a TARS parser!
// TARS version 1.0.1.
// **********************************************************************

package com.qq.tars.generated.tars;

import com.qq.tars.rpc.protocol.tars.support.TarsAbstractCallback;

/**
 * config obj to load server's system config.
 **/
public abstract class ConfigPrxCallback extends TarsAbstractCallback {

	public abstract void callback_ListConfig(int ret, java.util.List<String> vf);

	public abstract void callback_loadConfig(int ret, String config);

	public abstract void callback_loadConfigByHost(int ret, String config);

	public abstract void callback_checkConfig(int ret, String result);

	public abstract void callback_ListConfigByInfo(int ret, java.util.List<String> vf);

	public abstract void callback_loadConfigByInfo(int ret, String config);

	public abstract void callback_checkConfigByInfo(int ret, String result);

}
