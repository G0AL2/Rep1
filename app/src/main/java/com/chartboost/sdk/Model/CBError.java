package com.chartboost.sdk.Model;

/* loaded from: classes.dex */
public final class CBError {

    /* renamed from: a  reason: collision with root package name */
    private final b f13647a;

    /* renamed from: b  reason: collision with root package name */
    private final String f13648b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f13649c = true;

    /* loaded from: classes.dex */
    public enum CBClickError {
        URI_INVALID,
        URI_UNRECOGNIZED,
        AGE_GATE_FAILURE,
        NO_HOST_ACTIVITY,
        INTERNAL
    }

    /* loaded from: classes.dex */
    public enum CBImpressionError {
        INTERNAL,
        INTERNET_UNAVAILABLE,
        TOO_MANY_CONNECTIONS,
        WRONG_ORIENTATION,
        FIRST_SESSION_INTERSTITIALS_DISABLED,
        NETWORK_FAILURE,
        NO_AD_FOUND,
        SESSION_NOT_STARTED,
        IMPRESSION_ALREADY_VISIBLE,
        NO_HOST_ACTIVITY,
        USER_CANCELLATION,
        INVALID_LOCATION,
        VIDEO_UNAVAILABLE,
        VIDEO_ID_MISSING,
        ERROR_PLAYING_VIDEO,
        INVALID_RESPONSE,
        ASSETS_DOWNLOAD_FAILURE,
        ERROR_CREATING_VIEW,
        ERROR_DISPLAYING_VIEW,
        INCOMPATIBLE_API_VERSION,
        ERROR_LOADING_WEB_VIEW,
        ASSET_PREFETCH_IN_PROGRESS,
        ACTIVITY_MISSING_IN_MANIFEST,
        EMPTY_LOCAL_VIDEO_LIST,
        END_POINT_DISABLED,
        HARDWARE_ACCELERATION_DISABLED,
        PENDING_IMPRESSION_ERROR,
        VIDEO_UNAVAILABLE_FOR_CURRENT_ORIENTATION,
        ASSET_MISSING,
        WEB_VIEW_PAGE_LOAD_TIMEOUT,
        WEB_VIEW_CLIENT_RECEIVED_ERROR,
        INTERNET_UNAVAILABLE_AT_SHOW,
        INTERNET_UNAVAILABLE_AT_CACHE;
        
        private String adID = "";

        CBImpressionError() {
        }

        public String getAdId() {
            return this.adID;
        }

        public String setAdId(String str) {
            this.adID = str;
            return str;
        }
    }

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f13651a;

        static {
            int[] iArr = new int[b.values().length];
            f13651a = iArr;
            try {
                iArr[b.MISCELLANEOUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13651a[b.UNEXPECTED_RESPONSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13651a[b.PUBLIC_KEY_MISSING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13651a[b.INTERNET_UNAVAILABLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13651a[b.HTTP_NOT_FOUND.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13651a[b.NETWORK_FAILURE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13651a[b.INVALID_RESPONSE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        MISCELLANEOUS,
        INTERNET_UNAVAILABLE,
        INVALID_RESPONSE,
        UNEXPECTED_RESPONSE,
        NETWORK_FAILURE,
        PUBLIC_KEY_MISSING,
        HTTP_NOT_FOUND
    }

    public CBError(b bVar, String str) {
        this.f13647a = bVar;
        this.f13648b = str;
    }

    public b getError() {
        return this.f13647a;
    }

    public String getErrorDesc() {
        return this.f13648b;
    }

    public CBImpressionError getImpressionError() {
        int i10 = a.f13651a[this.f13647a.ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return CBImpressionError.INTERNAL;
        }
        if (i10 != 4) {
            if (i10 != 5) {
                return CBImpressionError.NETWORK_FAILURE;
            }
            return CBImpressionError.NO_AD_FOUND;
        }
        return CBImpressionError.INTERNET_UNAVAILABLE;
    }

    public boolean isRecoverable() {
        return this.f13649c;
    }

    public void setRecoverable(boolean z10) {
        this.f13649c = z10;
    }
}
