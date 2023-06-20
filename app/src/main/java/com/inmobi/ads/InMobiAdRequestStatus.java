package com.inmobi.ads;

/* loaded from: classes3.dex */
public final class InMobiAdRequestStatus {

    /* renamed from: a  reason: collision with root package name */
    private static final String f24362a = "InMobiAdRequestStatus";

    /* renamed from: b  reason: collision with root package name */
    private StatusCode f24363b;

    /* renamed from: c  reason: collision with root package name */
    private String f24364c;

    /* renamed from: com.inmobi.ads.InMobiAdRequestStatus$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f24365a;

        static {
            int[] iArr = new int[StatusCode.values().length];
            f24365a = iArr;
            try {
                iArr[StatusCode.INTERNAL_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24365a[StatusCode.NETWORK_UNREACHABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24365a[StatusCode.REQUEST_INVALID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24365a[StatusCode.REQUEST_PENDING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24365a[StatusCode.REQUEST_TIMED_OUT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24365a[StatusCode.SERVER_ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f24365a[StatusCode.NO_FILL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f24365a[StatusCode.AD_ACTIVE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f24365a[StatusCode.EARLY_REFRESH_REQUEST.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f24365a[StatusCode.AD_NO_LONGER_AVAILABLE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f24365a[StatusCode.MISSING_REQUIRED_DEPENDENCIES.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f24365a[StatusCode.REPETITIVE_LOAD.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f24365a[StatusCode.GDPR_COMPLIANCE_ENFORCED.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f24365a[StatusCode.GET_SIGNALS_CALLED_WHILE_LOADING.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f24365a[StatusCode.LOAD_WITH_RESPONSE_CALLED_WHILE_LOADING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f24365a[StatusCode.INVALID_RESPONSE_IN_LOAD.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f24365a[StatusCode.MONETIZATION_DISABLED.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f24365a[StatusCode.CALLED_FROM_WRONG_THREAD.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f24365a[StatusCode.CONFIGURATION_ERROR.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f24365a[StatusCode.LOW_MEMORY.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public enum StatusCode {
        NO_ERROR,
        NETWORK_UNREACHABLE,
        NO_FILL,
        REQUEST_INVALID,
        REQUEST_PENDING,
        REQUEST_TIMED_OUT,
        INTERNAL_ERROR,
        SERVER_ERROR,
        AD_ACTIVE,
        EARLY_REFRESH_REQUEST,
        AD_NO_LONGER_AVAILABLE,
        MISSING_REQUIRED_DEPENDENCIES,
        REPETITIVE_LOAD,
        GDPR_COMPLIANCE_ENFORCED,
        GET_SIGNALS_CALLED_WHILE_LOADING,
        LOAD_WITH_RESPONSE_CALLED_WHILE_LOADING,
        INVALID_RESPONSE_IN_LOAD,
        MONETIZATION_DISABLED,
        CALLED_FROM_WRONG_THREAD,
        CONFIGURATION_ERROR,
        LOW_MEMORY
    }

    public InMobiAdRequestStatus(StatusCode statusCode) {
        this.f24363b = statusCode;
        switch (AnonymousClass1.f24365a[statusCode.ordinal()]) {
            case 1:
                this.f24364c = "The InMobi SDK encountered an internal error.";
                return;
            case 2:
                this.f24364c = "The Internet is unreachable. Please check your Internet connection.";
                return;
            case 3:
                this.f24364c = "An invalid ad request was sent and was rejected by the Ad Network. Please validate the ad request and try again";
                return;
            case 4:
                this.f24364c = "The SDK is pending response to a previous ad request. Please wait for the previous ad request to complete before requesting for another ad.";
                return;
            case 5:
                this.f24364c = "The Ad Request timed out waiting for a response from the network. This can be caused due to a bad network connection. Please try again after a few minutes.";
                return;
            case 6:
                this.f24364c = "The Ad Server encountered an error when processing the ad request. This may be a transient issue. Please try again in a few minutes";
                return;
            case 7:
                this.f24364c = "Ad request successful but no ad served.";
                return;
            case 8:
                this.f24364c = "The Ad Request could not be submitted as the user is viewing another Ad.";
                return;
            case 9:
                this.f24364c = "The Ad Request cannot be done so frequently. Please wait for some time before loading another ad.";
                return;
            case 10:
                this.f24364c = "An ad is no longer available. Please call load() to fetch a fresh ad.";
                return;
            case 11:
                this.f24364c = "The SDK rejected the ad request as one or more required dependencies could not be found. Please ensure you have included the required dependencies.";
                return;
            case 12:
                this.f24364c = "The SDK rejected the ad load request. Multiple load() call on the same object is not allowed if the previous ad request was successful.";
                return;
            case 13:
                this.f24364c = "Network Request dropped as current request is not GDPR compliant.";
                return;
            case 14:
                this.f24364c = "An ad load is already in progress, getSignals() call in this state is not allowed.";
                return;
            case 15:
                this.f24364c = "An ad load is already in progress, load(response) call in this state is not allowed.";
                return;
            case 16:
                this.f24364c = "Null or empty response as parameter is not allowed in load(response).";
                return;
            case 17:
                this.f24364c = "The Ad Request is terminated because monetization is disabled.";
                return;
            case 18:
                this.f24364c = "An API call is made from non-ui thread.";
                return;
            case 19:
                this.f24364c = "InMobi Ad Object is not configured properly Please check if setBannerSize(int widthInDp, int heightInDp) or setLayoutParams(<Layout_Params>) have been configured correctly";
                return;
            case 20:
                this.f24364c = "The app is running low on memory, hence resulting in failure";
                return;
            default:
                return;
        }
    }

    public final String getMessage() {
        return this.f24364c;
    }

    public final StatusCode getStatusCode() {
        return this.f24363b;
    }

    public final InMobiAdRequestStatus setCustomMessage(String str) {
        if (str != null) {
            this.f24364c = str;
        }
        return this;
    }
}
