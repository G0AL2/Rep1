package com.amazon.device.ads;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class DTBMetricsConfiguration {
    static final String ANALYTICS_KEY_NAME = "analytics";
    static final String API_KEY_ANALYTICS_KEY_NAME = "api_key";
    static final String CONFIG_DIR = "config";
    static final String CONFIG_WITH_JSON = "aps_mobile_client_config.json";
    static final String DISTRIBUTION_PIXEL_SAMPLE_RATE_KEY_NAME = "distribution_pixel";
    private static final String LOG_TAG = "DTBMetricsConfiguration";
    static final String SAMPLE_RATES_KEY_NAME = "sample_rates";
    static final String SAMPLING_RATE_ANALYTICS_KEY_NAME = "sampling_rate";
    static final String SPP_FLAG_DEFAULT_VALUE = "leq";
    static final String SPP_FLAG_KEY_NAME = "spp_flag";
    static final String URL_ANALYTICS_KEY_NAME = "url";
    static final String WRAPPING_PIXEL_SAMPLE_RATE_KEY_NAME = "wrapping_pixel";
    private static DTBMetricsConfiguration theInstance;
    private JSONObject configuration;
    static final Integer WRAPPING_PIXEL_DEFAULT_VALUE = 5;
    static final Integer DISTRIBUTION_PIXEL_DEFAULT_VALUE = 1;
    static final Integer ANALYTIC_PIXEL_DEFAULT_VALUE = 1;

    private DTBMetricsConfiguration() {
        DTBAdUtil.createDirIfDoesNotExist(CONFIG_DIR);
        loadConfiguration();
        DtbThreadService.getInstance().execute(new Runnable() { // from class: com.amazon.device.ads.g0
            @Override // java.lang.Runnable
            public final void run() {
                DTBMetricsConfiguration.a(DTBMetricsConfiguration.this);
            }
        });
    }

    public static /* synthetic */ void a(DTBMetricsConfiguration dTBMetricsConfiguration) {
        dTBMetricsConfiguration.lambda$new$0();
    }

    public static Integer getAnalyticsParams(String str, int i10) {
        try {
            JSONObject configParams = getInstance().getConfigParams(ANALYTICS_KEY_NAME);
            if (configParams != null) {
                try {
                    if (configParams.has(str)) {
                        return Integer.valueOf(configParams.getInt(str));
                    }
                } catch (Exception unused) {
                    DtbLog.warn("Unable to get sample rates for " + str + " from configuration. Using default value");
                }
            }
        } catch (RuntimeException e10) {
            DtbLog.error(LOG_TAG, "Fail to execute getSampleRateForPixel method");
            l2.a.i(m2.b.ERROR, m2.c.EXCEPTION, "Fail to execute getSampleRateForPixel method", e10);
        }
        return Integer.valueOf(i10);
    }

    public static Integer getClientConfigVal(String str, int i10, String str2) {
        try {
            JSONObject configParams = getInstance().getConfigParams(str2);
            if (configParams != null) {
                try {
                    if (configParams.has(str)) {
                        return Integer.valueOf(configParams.getInt(str));
                    }
                } catch (Exception unused) {
                    DtbLog.warn("Unable to get" + str2 + "for " + str + " from configuration. Using default value");
                }
            }
        } catch (RuntimeException e10) {
            DtbLog.error(LOG_TAG, "Fail to execute getClientConfigVal method");
            l2.a.i(m2.b.ERROR, m2.c.EXCEPTION, "Fail to execute getClientConfigVal method", e10);
        }
        return Integer.valueOf(i10);
    }

    private JSONObject getConfigParams(String str) {
        if (this.configuration.has(str)) {
            try {
                return this.configuration.getJSONObject(str);
            } catch (JSONException unused) {
                DtbLog.error("Unable to get" + str + "from configuration");
                return null;
            }
        }
        return null;
    }

    public static synchronized DTBMetricsConfiguration getInstance() {
        DTBMetricsConfiguration dTBMetricsConfiguration;
        synchronized (DTBMetricsConfiguration.class) {
            if (theInstance == null) {
                theInstance = new DTBMetricsConfiguration();
            }
            dTBMetricsConfiguration = theInstance;
        }
        return dTBMetricsConfiguration;
    }

    private String getWorkingDirContent() throws IOException {
        return DTBAdUtil.loadFile(CONFIG_WITH_JSON, CONFIG_DIR);
    }

    /* renamed from: loadConfigurationFromWeb */
    public void lambda$new$0() {
        try {
            DtbHttpClient dtbHttpClient = new DtbHttpClient(WebResourceOptions.getCDNHost() + CONFIG_WITH_JSON);
            dtbHttpClient.setUseSecure(DtbDebugProperties.getIsSecure(true));
            dtbHttpClient.executeGET(60000);
            if (dtbHttpClient.getResponseCode() == 200) {
                String response = dtbHttpClient.getResponse();
                File filesDir = AdRegistration.getContext().getFilesDir();
                File createTempFile = File.createTempFile("temp", "json", filesDir);
                FileWriter fileWriter = new FileWriter(createTempFile);
                fileWriter.write(response);
                fileWriter.close();
                File file = new File(filesDir.getAbsolutePath() + "/" + CONFIG_DIR + "/" + CONFIG_WITH_JSON);
                if (file.exists()) {
                    file.delete();
                }
                if (!createTempFile.renameTo(file)) {
                    DtbLog.error("Rename failed");
                }
                loadConfiguration();
                return;
            }
            throw new RuntimeException("resource aps_mobile_client_config.json not available");
        } catch (Exception e10) {
            DtbLog.error("Error loading configuration:" + e10.toString());
        }
    }

    String getConfigVal(String str) {
        if (this.configuration.has(str)) {
            try {
                return this.configuration.getString(str);
            } catch (JSONException unused) {
                DtbLog.error("Unable to get" + str + "from configuration");
                return null;
            }
        }
        return null;
    }

    public synchronized boolean isTypeEnabled(String str) {
        JSONObject jSONObject = this.configuration;
        if (jSONObject != null) {
            try {
                JSONObject jSONObject2 = jSONObject.getJSONObject("metrics");
                if (jSONObject2.has(str)) {
                    return jSONObject2.getBoolean(str);
                }
            } catch (JSONException unused) {
                DtbLog.error("Unable to get metrics from configuration");
            }
        }
        return false;
    }

    synchronized void loadConfiguration() {
        try {
            String workingDirContent = getWorkingDirContent();
            if (workingDirContent == null) {
                workingDirContent = DTBAdUtil.loadFromAssets(CONFIG_WITH_JSON);
            }
            this.configuration = new JSONObject(workingDirContent);
        } catch (IOException unused) {
        } catch (JSONException unused2) {
            DtbLog.error("Invalid configuration");
        }
    }

    public static String getClientConfigVal(String str, String str2, String str3) {
        try {
            JSONObject configParams = getInstance().getConfigParams(str3);
            if (configParams != null) {
                try {
                    if (configParams.has(str)) {
                        return configParams.getString(str);
                    }
                } catch (Exception unused) {
                    DtbLog.warn("Unable to get" + str3 + "for " + str + " from configuration. Using default value");
                }
            }
        } catch (RuntimeException e10) {
            DtbLog.error(LOG_TAG, "Fail to execute getClientConfigVal method");
            l2.a.i(m2.b.ERROR, m2.c.EXCEPTION, "Fail to execute getClientConfigVal method", e10);
        }
        return str2;
    }

    public static String getClientConfigVal(String str, String str2) {
        String configVal;
        try {
            configVal = getInstance().getConfigVal(str2);
        } catch (RuntimeException e10) {
            DtbLog.error(LOG_TAG, "Fail to execute getClientConfigVal method");
            l2.a.i(m2.b.ERROR, m2.c.EXCEPTION, "Fail to execute getClientConfigVal method", e10);
        }
        return !DtbCommonUtils.isNullOrEmpty(configVal) ? configVal : str;
    }
}
