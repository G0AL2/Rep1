package com.bytedance.sdk.component.adexpress.dynamic.c;

import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.dynamic.c.a;
import com.bytedance.sdk.component.utils.t;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: LayoutUnitSizeUtils.java */
/* loaded from: classes.dex */
public class l {

    /* renamed from: a  reason: collision with root package name */
    private static final Set<String> f9672a = Collections.unmodifiableSet(new HashSet(Arrays.asList("dislike", "close", "close-fill", "webview-close")));

    /* renamed from: b  reason: collision with root package name */
    private static String f9673b;

    public static a.c a(String str, String str2, String str3, boolean z10, boolean z11, int i10) {
        int i11;
        int i12;
        float optDouble;
        float optDouble2;
        float optDouble3;
        float f10;
        float f11;
        a.c cVar = new a.c();
        if (!str.startsWith("<svg") && !f9672a.contains(str2)) {
            if ("logo".equals(str2)) {
                if (!com.bytedance.sdk.component.adexpress.c.b() && ((!TextUtils.isEmpty(str) && str.contains("adx:")) || b())) {
                    if (b()) {
                        return a(cVar, str, str3, f9673b);
                    }
                    return a(cVar, str, str3, "");
                }
                cVar.f9639a = "union".equals(str) ? 10.0f : 20.0f;
                cVar.f9640b = 10.0f;
                if (com.bytedance.sdk.component.adexpress.c.b()) {
                    if ((str2 + str).contains("logoad")) {
                        return a("AD", str3);
                    }
                }
                return cVar;
            }
            if ("development-name".equals(str2)) {
                str = "开发者：" + str;
            }
            if ("app-version".equals(str2)) {
                str = "版本号：V" + str;
            }
            if ("score-count".equals(str2)) {
                try {
                    i11 = Integer.parseInt(str);
                } catch (NumberFormatException unused) {
                    i11 = 0;
                }
                return a("(" + String.format(t.a(com.bytedance.sdk.component.adexpress.c.a(), "tt_comment_num"), Integer.valueOf(i11)) + ")", str3);
            } else if ("score-count-type-2".equals(str2)) {
                try {
                    i12 = Integer.parseInt(str);
                } catch (NumberFormatException unused2) {
                    i12 = 0;
                }
                return a("(" + String.format(new DecimalFormat("###,###,###").format(i12), Integer.valueOf(i12)) + ")", str3);
            } else if ("feedback-dislike".equals(str2)) {
                return a(t.a(com.bytedance.sdk.component.adexpress.c.a(), "tt_reward_feedback"), str3);
            } else {
                if (!"skip-with-time-countdown".equals(str2) && !TextUtils.equals("skip-with-countdowns-video-countdown", str2)) {
                    if (TextUtils.equals("skip-with-countdowns-skip-btn", str2)) {
                        return a(" | " + t.a(com.bytedance.sdk.component.adexpress.c.a(), "tt_reward_screen_skip_tx"), str3);
                    } else if (TextUtils.equals("skip-with-countdowns-skip-countdown", str2)) {
                        return a(" | " + String.format(t.a(com.bytedance.sdk.component.adexpress.c.a(), "tt_reward_full_skip_count_down"), "00"), str3);
                    } else if ("skip-with-time-skip-btn".equals(str2)) {
                        return a(" |  " + t.a(com.bytedance.sdk.component.adexpress.c.a(), "tt_reward_screen_skip_tx"), str3);
                    } else if ("skip".equals(str2)) {
                        return a(t.a(com.bytedance.sdk.component.adexpress.c.a(), "tt_reward_screen_skip_tx"), str3);
                    } else {
                        if ("timedown".equals(str2)) {
                            return a("0.0", str3);
                        }
                        if ("text_star".equals(str2)) {
                            return a("0.00", str3);
                        }
                        if (TextUtils.equals("privacy-detail", str2)) {
                            return a("权限列表 | 隐私政策", str3);
                        }
                        if ("arrowButton".equals(str2)) {
                            return a("立即下载", str3);
                        }
                        if ("title".equals(str2)) {
                            try {
                                return a(str.replace('\n', ' '), str3, true);
                            } catch (Exception unused3) {
                            }
                        }
                        if (!"fillButton".equals(str2) && !"text".equals(str2) && !"button".equals(str2) && !"downloadWithIcon".equals(str2) && !"downloadButton".equals(str2) && !"laceButton".equals(str2) && !"cardButton".equals(str2) && !"colourMixtureButton".equals(str2) && !"arrowButton".equals(str2) && !"source".equals(str2) && !TextUtils.equals("app-version", str2) && !TextUtils.equals("development-name", str2)) {
                            try {
                                JSONObject jSONObject = new JSONObject(str3);
                                int length = str.length();
                                optDouble = (float) jSONObject.optDouble("fontSize");
                                float optDouble4 = (float) jSONObject.optDouble("letterSpacing");
                                optDouble2 = (float) jSONObject.optDouble("lineHeight");
                                optDouble3 = (float) jSONObject.optDouble("maxWidth");
                                f10 = (length * (optDouble + optDouble4)) - optDouble4;
                                com.bytedance.sdk.component.utils.l.e("DynamicBaseWidget", "getDomSizeFromNative letterSpacing==" + optDouble4 + ",lineHeight==" + optDouble2 + ",maxWidth ==" + optDouble3 + ",totalStrLength" + f10);
                            } catch (JSONException e10) {
                                e10.printStackTrace();
                            }
                            if ("muted".equals(str2)) {
                                cVar.f9639a = optDouble;
                                cVar.f9640b = optDouble;
                                return cVar;
                            } else if ("star".equals(str2)) {
                                cVar.f9639a = 5.0f * optDouble;
                                cVar.f9640b = optDouble;
                                return cVar;
                            } else if ("icon".equals(str2)) {
                                cVar.f9639a = optDouble;
                                cVar.f9640b = optDouble;
                                return cVar;
                            } else {
                                if (z10) {
                                    int i13 = ((int) (f10 / optDouble3)) + 1;
                                    if (!z11 || i13 < i10) {
                                        i10 = i13;
                                    }
                                    f11 = (float) (optDouble2 * optDouble * i10 * 1.2d);
                                } else {
                                    float f12 = (float) (optDouble2 * optDouble * 1.2d);
                                    if (f10 <= optDouble3) {
                                        optDouble3 = f10;
                                    }
                                    f11 = f12;
                                }
                                cVar.f9639a = optDouble3;
                                cVar.f9640b = f11;
                                return cVar;
                            }
                        }
                        return a(str, str3);
                    }
                }
                return a("00S", str3);
            }
        }
        try {
            if ("close".equals(str2)) {
                float optDouble5 = (float) new JSONObject(str3).optDouble("fontSize");
                cVar.f9639a = optDouble5;
                cVar.f9640b = optDouble5;
                return cVar;
            }
        } catch (Exception unused4) {
        }
        cVar.f9639a = 10.0f;
        cVar.f9640b = 10.0f;
        return cVar;
    }

    public static String b(String str, String str2, String str3, boolean z10, boolean z11, int i10) {
        JSONObject jSONObject = new JSONObject();
        a.c a10 = a(str, str2, str3, z10, z11, i10);
        try {
            jSONObject.put("width", a10.f9639a);
            jSONObject.put("height", a10.f9640b);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        return jSONObject.toString();
    }

    public static void b(String str) {
        f9673b = str;
    }

    public static boolean b() {
        return !TextUtils.isEmpty(f9673b);
    }

    public static String a(String str) {
        String[] split;
        return (TextUtils.isEmpty(str) || (split = str.split("adx:")) == null || split.length < 2) ? "" : split[1];
    }

    private static a.c a(a.c cVar, String str, String str2, String str3) {
        if (str.contains("union")) {
            cVar.f9639a = 0.0f;
            cVar.f9640b = 0.0f;
        } else {
            if (TextUtils.isEmpty(str3)) {
                str3 = a(str);
            }
            if (TextUtils.isEmpty(str3)) {
                cVar.f9639a = 0.0f;
                cVar.f9640b = 0.0f;
            } else {
                return a(str3, str2);
            }
        }
        return cVar;
    }

    public static a.c a(String str, String str2) {
        return a(str, str2, false);
    }

    public static a.c a(String str, String str2, boolean z10) {
        a.c cVar = new a.c();
        try {
            int[] a10 = a(str, (int) Double.parseDouble(new JSONObject(str2).optString("fontSize")), z10);
            cVar.f9639a = a10[0];
            cVar.f9640b = a10[1];
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return cVar;
    }

    public static int[] a(String str, int i10, boolean z10) {
        int[] a10 = a(str, i10, z10);
        return new int[]{com.bytedance.sdk.component.adexpress.c.b.b(com.bytedance.sdk.component.adexpress.c.a(), a10[0]), com.bytedance.sdk.component.adexpress.c.b.b(com.bytedance.sdk.component.adexpress.c.a(), a10[1])};
    }

    public static int[] a(String str, float f10, boolean z10) {
        TextView textView = new TextView(com.bytedance.sdk.component.adexpress.c.a());
        textView.setTextSize(f10);
        textView.setText(str);
        textView.setIncludeFontPadding(false);
        if (z10) {
            textView.setSingleLine();
        }
        textView.measure(-2, -2);
        return new int[]{textView.getMeasuredWidth() + 2, textView.getMeasuredHeight() + 2};
    }

    public static String a() {
        return f9673b;
    }
}
