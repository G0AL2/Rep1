package com.amazon.device.ads;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class DTBFetchFactory {
    private static final String LOG_TAG = "DTBFetchFactory";
    private static DTBFetchFactory theFactory;
    private final int EXPIRATION_INTERVAL_MS = 480000;
    private Map<String, DTBFetchManager> managers = new HashMap();

    private DTBFetchFactory() {
    }

    public static DTBFetchFactory getInstance() {
        try {
            if (theFactory == null) {
                theFactory = new DTBFetchFactory();
            }
        } catch (RuntimeException e10) {
            DtbLog.error(LOG_TAG, "Fail to initialize DTBFetchFactory");
            l2.a.i(m2.b.ERROR, m2.c.EXCEPTION, "Fail to initialize DTBFetchFactory", e10);
        }
        return theFactory;
    }

    public DTBFetchManager createFetchManager(String str, DTBAdLoader dTBAdLoader) {
        return createFetchManager(str, dTBAdLoader, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int getExpirationInMillis() {
        return 480000;
    }

    public DTBFetchManager getFetchManager(String str) {
        if (DtbCommonUtils.isNullOrEmpty(str)) {
            DtbLog.debug("The fetch manager label is null or empty");
        }
        return this.managers.get(str);
    }

    public void removeFetchManager(String str) {
        try {
            if (DtbCommonUtils.isNullOrEmpty(str)) {
                DtbLog.debug("The fetch manager label is null or empty");
            }
            DTBFetchManager fetchManager = getFetchManager(str);
            if (fetchManager != null) {
                fetchManager.stop();
                fetchManager.submitWasteQueueReport();
                this.managers.remove(str);
            }
        } catch (RuntimeException e10) {
            DtbLog.error(LOG_TAG, "Fail to execute removeFetchManager method");
            l2.a.i(m2.b.ERROR, m2.c.EXCEPTION, "Fail to execute removeFetchManager method", e10);
        }
    }

    public DTBFetchManager createFetchManager(String str, DTBAdLoader dTBAdLoader, boolean z10) {
        if (!DtbCommonUtils.isNullOrEmpty(str) && dTBAdLoader != null) {
            DTBFetchManager fetchManager = getFetchManager(str);
            if (fetchManager == null) {
                DTBFetchManager dTBFetchManager = new DTBFetchManager(dTBAdLoader, z10);
                this.managers.put(str, dTBFetchManager);
                return dTBFetchManager;
            }
            DtbLog.warn("The fetch manager with the provided label has already been created");
            return fetchManager;
        }
        throw new IllegalArgumentException("Fetch manager label and loader cannot be null or empty.");
    }
}
