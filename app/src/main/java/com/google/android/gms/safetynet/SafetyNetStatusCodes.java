package com.google.android.gms.safetynet;

import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.common.internal.ShowFirstParty;

/* compiled from: com.google.android.gms:play-services-safetynet@@17.0.1 */
/* loaded from: classes2.dex */
public final class SafetyNetStatusCodes extends CommonStatusCodes {
    @ShowFirstParty
    public static final int APP_NOT_HARMFUL = 12018;
    public static final int INVALID_ADMIN_APPLICATION = 12011;
    public static final int OS_VERSION_NOT_SUPPORTED = 12010;
    @ShowFirstParty
    public static final int PACKAGE_WARNING_IN_PROGRESS = 12015;
    public static final int RECAPTCHA_INVALID_KEYTYPE = 12008;
    public static final int RECAPTCHA_INVALID_PACKAGE_NAME = 12013;
    public static final int RECAPTCHA_INVALID_SITEKEY = 12007;
    @ShowFirstParty
    public static final int REMOVE_HARMFULAPP_ACTION_NOT_RESOLVED = 12017;
    public static final int SAFE_BROWSING_API_NOT_AVAILABLE = 12002;
    public static final int SAFE_BROWSING_API_NOT_INITIALIZED = 12009;
    @ShowFirstParty
    public static final int SAFE_BROWSING_CONNECTION_ERROR = 12019;
    public static final int SAFE_BROWSING_LIST_PARSE_ERROR = 12014;
    public static final int SAFE_BROWSING_MISSING_API_KEY = 12001;
    public static final int SAFE_BROWSING_UNSUPPORTED_THREAT_TYPES = 12000;
    public static final int SINGLE_USER_SERVICE_NOT_AVAILABLE = 12012;
    public static final int UNSUPPORTED_SDK_VERSION = 12006;
    public static final int VERIFY_APPS_INTERNAL_ERROR = 12004;
    public static final int VERIFY_APPS_NOT_AVAILABLE = 12003;
    public static final int VERIFY_APPS_NOT_ENABLED = 12005;

    private SafetyNetStatusCodes() {
    }
}
