package com.chartboost.sdk.Privacy.model;

import qe.g;

/* loaded from: classes.dex */
public final class COPPA extends GenericDataUseConsent {
    public static final String COPPA_STANDARD = "coppa";
    public static final Companion Companion = new Companion(null);

    /* renamed from: c  reason: collision with root package name */
    private final boolean f13757c;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public COPPA(boolean z10) {
        this.f13757c = z10;
        setPrivacyStandard(COPPA_STANDARD);
        setConsent(Boolean.valueOf(z10));
    }

    private final int a(boolean z10) {
        return z10 ? 1 : 0;
    }

    public final int getConsentBooleanAsInt() {
        return a(((Boolean) getConsent()).booleanValue());
    }

    public final boolean isChildDirected() {
        return this.f13757c;
    }
}
