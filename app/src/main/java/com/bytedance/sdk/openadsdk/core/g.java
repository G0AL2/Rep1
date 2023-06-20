package com.bytedance.sdk.openadsdk.core;

import com.applovin.sdk.AppLovinErrorCodes;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* compiled from: ErrorCode.java */
/* loaded from: classes.dex */
public class g {
    public static String a(int i10) {
        if (i10 != -100) {
            if (i10 != 113) {
                if (i10 != 123) {
                    if (i10 != 20001) {
                        if (i10 != 50001) {
                            if (i10 != 60007) {
                                if (i10 != -16) {
                                    if (i10 != -15) {
                                        if (i10 != 117) {
                                            if (i10 != 118) {
                                                if (i10 != 127) {
                                                    if (i10 != 128) {
                                                        if (i10 != 201) {
                                                            if (i10 != 202) {
                                                                if (i10 != 10002) {
                                                                    if (i10 != 10003) {
                                                                        switch (i10) {
                                                                            case -12:
                                                                                return com.bytedance.sdk.component.utils.t.a(m.a(), "tt_splash_not_have_cache_error");
                                                                            case -11:
                                                                                return com.bytedance.sdk.component.utils.t.a(m.a(), "tt_splash_cache_expired_error");
                                                                            case -10:
                                                                                return com.bytedance.sdk.component.utils.t.a(m.a(), "tt_splash_cache_parse_error");
                                                                            case -9:
                                                                                return com.bytedance.sdk.component.utils.t.a(m.a(), "tt_request_body_error");
                                                                            case AppLovinErrorCodes.INVALID_AD_TOKEN /* -8 */:
                                                                                return com.bytedance.sdk.component.utils.t.a(m.a(), "tt_frequent_call_erroe");
                                                                            case AppLovinErrorCodes.INVALID_ZONE /* -7 */:
                                                                                return com.bytedance.sdk.component.utils.t.a(m.a(), "tt_splash_ad_load_image_error");
                                                                            case AppLovinErrorCodes.UNABLE_TO_RENDER_AD /* -6 */:
                                                                                return com.bytedance.sdk.component.utils.t.a(m.a(), "tt_insert_ad_load_image_error");
                                                                            case -5:
                                                                                return com.bytedance.sdk.component.utils.t.a(m.a(), "tt_banner_ad_load_image_error");
                                                                            case -4:
                                                                                return com.bytedance.sdk.component.utils.t.a(m.a(), "tt_ad_data_error");
                                                                            case -3:
                                                                                return com.bytedance.sdk.component.utils.t.a(m.a(), "tt_no_ad_parse");
                                                                            case -2:
                                                                                return com.bytedance.sdk.component.utils.t.a(m.a(), "tt_net_error");
                                                                            case -1:
                                                                                return com.bytedance.sdk.component.utils.t.a(m.a(), "tt_parse_fail");
                                                                            default:
                                                                                switch (i10) {
                                                                                    case 101:
                                                                                        return com.bytedance.sdk.component.utils.t.a(m.a(), "tt_render_render_parse_error");
                                                                                    case 102:
                                                                                        return com.bytedance.sdk.component.utils.t.a(m.a(), "tt_render_main_template_invalid");
                                                                                    case 103:
                                                                                        return com.bytedance.sdk.component.utils.t.a(m.a(), "tt_render_diff_template_invalid");
                                                                                    case 104:
                                                                                        return com.bytedance.sdk.component.utils.t.a(m.a(), "tt_render_fail_meta_invalid");
                                                                                    case 105:
                                                                                        return com.bytedance.sdk.component.utils.t.a(m.a(), "tt_render_fail_template_parse_error");
                                                                                    case 106:
                                                                                        return com.bytedance.sdk.component.utils.t.a(m.a(), "tt_render_fail_unknown");
                                                                                    case 107:
                                                                                        return com.bytedance.sdk.component.utils.t.a(m.a(), "tt_render_fail_timeout");
                                                                                    case 108:
                                                                                        return com.bytedance.sdk.component.utils.t.a(m.a(), "tt_reder_ad_load_timeout");
                                                                                    case 109:
                                                                                        return com.bytedance.sdk.component.utils.t.a(m.a(), "tt_template_load_fail");
                                                                                    default:
                                                                                        switch (i10) {
                                                                                            case 40000:
                                                                                                return com.bytedance.sdk.component.utils.t.a(m.a(), "tt_content_type");
                                                                                            case 40001:
                                                                                                return com.bytedance.sdk.component.utils.t.a(m.a(), "tt_request_pb_error");
                                                                                            case 40002:
                                                                                                return com.bytedance.sdk.component.utils.t.a(m.a(), "tt_app_empty");
                                                                                            case 40003:
                                                                                                return com.bytedance.sdk.component.utils.t.a(m.a(), "tt_wap_empty");
                                                                                            case 40004:
                                                                                                return com.bytedance.sdk.component.utils.t.a(m.a(), "tt_adslot_empty");
                                                                                            case 40005:
                                                                                                return com.bytedance.sdk.component.utils.t.a(m.a(), "tt_adslot_size_empty");
                                                                                            case 40006:
                                                                                                return com.bytedance.sdk.component.utils.t.a(m.a(), "tt_adslot_id_error");
                                                                                            case 40007:
                                                                                                return com.bytedance.sdk.component.utils.t.a(m.a(), "tt_error_code_adcount_error");
                                                                                            case 40008:
                                                                                                return com.bytedance.sdk.component.utils.t.a(m.a(), "tt_error_image_size");
                                                                                            case 40009:
                                                                                                return com.bytedance.sdk.component.utils.t.a(m.a(), "tt_error_media_id");
                                                                                            case 40010:
                                                                                                return com.bytedance.sdk.component.utils.t.a(m.a(), "tt_error_media_type");
                                                                                            case 40011:
                                                                                                return com.bytedance.sdk.component.utils.t.a(m.a(), "tt_error_ad_type");
                                                                                            case 40012:
                                                                                            case 40017:
                                                                                                return com.bytedance.sdk.component.utils.t.a(m.a(), "tt_error_access_method_pass");
                                                                                            case 40013:
                                                                                                return com.bytedance.sdk.component.utils.t.a(m.a(), "tt_error_splash_ad_type");
                                                                                            case 40014:
                                                                                                return com.bytedance.sdk.component.utils.t.a(m.a(), "tt_error_redirect");
                                                                                            case 40015:
                                                                                                return com.bytedance.sdk.component.utils.t.a(m.a(), "tt_error_request_invalid");
                                                                                            case 40016:
                                                                                                return com.bytedance.sdk.component.utils.t.a(m.a(), "tt_error_slot_id_app_id_differ");
                                                                                            case 40018:
                                                                                                return com.bytedance.sdk.component.utils.t.a(m.a(), "tt_error_package_name");
                                                                                            case 40019:
                                                                                                return com.bytedance.sdk.component.utils.t.a(m.a(), "tt_error_adtype_differ");
                                                                                            case 40020:
                                                                                                return com.bytedance.sdk.component.utils.t.a(m.a(), "tt_error_new_register_limit");
                                                                                            case 40021:
                                                                                                return com.bytedance.sdk.component.utils.t.a(m.a(), "tt_error_apk_sign_check_error");
                                                                                            case 40022:
                                                                                                return com.bytedance.sdk.component.utils.t.a(m.a(), "tt_error_origin_ad_error");
                                                                                            case 40023:
                                                                                                return com.bytedance.sdk.component.utils.t.a(m.a(), "tt_error_union_os_error");
                                                                                            case 40024:
                                                                                                return com.bytedance.sdk.component.utils.t.a(m.a(), "tt_error_union_sdk_too_old");
                                                                                            default:
                                                                                                switch (i10) {
                                                                                                    case 60001:
                                                                                                        return com.bytedance.sdk.component.utils.t.a(m.a(), "tt_ror_code_show_event_error");
                                                                                                    case 60002:
                                                                                                        return com.bytedance.sdk.component.utils.t.a(m.a(), "tt_error_code_click_event_error");
                                                                                                    default:
                                                                                                        return com.bytedance.sdk.component.utils.t.a(m.a(), "tt_error_unknow");
                                                                                                }
                                                                                        }
                                                                                }
                                                                        }
                                                                    }
                                                                    return "resource error";
                                                                }
                                                                return "load time out";
                                                            }
                                                            return com.bytedance.sdk.component.utils.t.a(m.a(), "tt_load_creative_icon_error");
                                                        }
                                                        return com.bytedance.sdk.component.utils.t.a(m.a(), "tt_load_creative_icon_response_error");
                                                    }
                                                    return "dynamic2 render error";
                                                }
                                                return "dynamic2 render time_out";
                                            }
                                            return "dynamic1 render error";
                                        }
                                        return "dynamic1 render time_out";
                                    }
                                    return com.bytedance.sdk.component.utils.t.a(m.a(), "tt_lack_android_manifest_configuration");
                                }
                                return com.bytedance.sdk.component.utils.t.a(m.a(), "tt_error_ad_able_false_msg");
                            }
                            return com.bytedance.sdk.component.utils.t.a(m.a(), "tt_error_verify_reward");
                        }
                        return com.bytedance.sdk.component.utils.t.a(m.a(), "tt_sys_error");
                    }
                    return com.bytedance.sdk.component.utils.t.a(m.a(), "tt_no_ad");
                }
                return "dynamic2 parse error";
            }
            return "dynamic1 parse error";
        }
        return com.bytedance.sdk.component.utils.t.a(m.a(), "tt_init_setting_config_not_complete");
    }

    public static String b(int i10) {
        switch (i10) {
            case ms.bd.o.Pgl.c.COLLECT_MODE_FINANCE /* 300 */:
                return "Missing title";
            case 301:
                return "Missing description";
            case IronSourceConstants.OFFERWALL_AVAILABLE /* 302 */:
                return "Missing cta";
            case 303:
                return "Missing score";
            case 304:
                return "Missing comment";
            case IronSourceConstants.OFFERWALL_OPENED /* 305 */:
                return "Missing icon";
            default:
                return "";
        }
    }
}
