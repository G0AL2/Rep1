package com.chartboost.sdk.Privacy.model;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import qe.g;
import qe.k;

/* loaded from: classes.dex */
public final class GDPR extends GenericDataUseConsent {
    public static final Companion Companion = new Companion(null);
    public static final String GDPR_STANDARD = "gdpr";

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public enum GDPR_CONSENT {
        NON_BEHAVIORAL("0"),
        BEHAVIORAL("1");
        
        public static final Companion Companion = new Companion(null);

        /* renamed from: a  reason: collision with root package name */
        private final String f13760a;

        /* loaded from: classes.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(g gVar) {
                this();
            }

            public final GDPR_CONSENT a(String str) {
                k.f(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                GDPR_CONSENT gdpr_consent = GDPR_CONSENT.NON_BEHAVIORAL;
                if (k.a(gdpr_consent.getValue(), str)) {
                    return gdpr_consent;
                }
                GDPR_CONSENT gdpr_consent2 = GDPR_CONSENT.BEHAVIORAL;
                if (k.a(gdpr_consent2.getValue(), str)) {
                    return gdpr_consent2;
                }
                return null;
            }
        }

        GDPR_CONSENT(String str) {
            this.f13760a = str;
        }

        public static final GDPR_CONSENT fromValue(String str) {
            return Companion.a(str);
        }

        public final String getValue() {
            return this.f13760a;
        }
    }

    public GDPR(GDPR_CONSENT gdpr_consent) {
        if (gdpr_consent != null && isValidConsent(gdpr_consent.getValue())) {
            setPrivacyStandard("gdpr");
            setConsent(gdpr_consent.getValue());
            return;
        }
        handleException(k.l("Invalid GDPR consent values. Use provided values or Custom class. Value: ", gdpr_consent));
    }

    @Override // com.chartboost.sdk.Privacy.model.GenericDataUseConsent, com.chartboost.sdk.Privacy.model.DataUseConsent
    public boolean isValidConsent(String str) {
        k.f(str, "consent");
        return k.a(GDPR_CONSENT.NON_BEHAVIORAL.getValue(), str) || k.a(GDPR_CONSENT.BEHAVIORAL.getValue(), str);
    }
}
