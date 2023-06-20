package com.chartboost.sdk.Privacy.model;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import qe.g;
import qe.k;

/* loaded from: classes.dex */
public final class CCPA extends GenericDataUseConsent {
    public static final String CCPA_STANDARD = "us_privacy";
    public static final Companion Companion = new Companion(null);

    /* loaded from: classes.dex */
    public enum CCPA_CONSENT {
        OPT_OUT_SALE("1YY-"),
        OPT_IN_SALE("1YN-");
        
        public static final Companion Companion = new Companion(null);

        /* renamed from: a  reason: collision with root package name */
        private final String f13756a;

        /* loaded from: classes.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(g gVar) {
                this();
            }

            public final CCPA_CONSENT a(String str) {
                k.f(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                CCPA_CONSENT ccpa_consent = CCPA_CONSENT.OPT_OUT_SALE;
                if (k.a(ccpa_consent.getValue(), str)) {
                    return ccpa_consent;
                }
                CCPA_CONSENT ccpa_consent2 = CCPA_CONSENT.OPT_IN_SALE;
                if (k.a(ccpa_consent2.getValue(), str)) {
                    return ccpa_consent2;
                }
                return null;
            }
        }

        CCPA_CONSENT(String str) {
            this.f13756a = str;
        }

        public static final CCPA_CONSENT fromValue(String str) {
            return Companion.a(str);
        }

        public final String getValue() {
            return this.f13756a;
        }
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public CCPA(CCPA_CONSENT ccpa_consent) {
        if (ccpa_consent != null && isValidConsent(ccpa_consent.getValue())) {
            setPrivacyStandard(CCPA_STANDARD);
            setConsent(ccpa_consent.getValue());
            return;
        }
        handleException(k.l("Invalid CCPA consent values. Use provided values or Custom class. Value: ", ccpa_consent));
    }

    @Override // com.chartboost.sdk.Privacy.model.GenericDataUseConsent, com.chartboost.sdk.Privacy.model.DataUseConsent
    public boolean isValidConsent(String str) {
        k.f(str, "consent");
        return k.a(CCPA_CONSENT.OPT_OUT_SALE.getValue(), str) || k.a(CCPA_CONSENT.OPT_IN_SALE.getValue(), str);
    }
}
