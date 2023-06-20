package com.facebook.react.views.text;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.views.text.f;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.api.Api;
import fm.castbox.mediation.BuildConfig;

/* loaded from: classes.dex */
public abstract class ReactTextAnchorViewManager<T extends View, C extends f> extends BaseViewManager<T, C> {
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3};
    private static final String TAG = "ReactTextAnchorViewManager";

    @w6.a(name = "adjustsFontSizeToFit")
    public void setAdjustFontSizeToFit(o oVar, boolean z10) {
        oVar.setAdjustFontSizeToFit(z10);
    }

    @w6.a(name = "android_hyphenationFrequency")
    public void setAndroidHyphenationFrequency(o oVar, String str) {
        if (Build.VERSION.SDK_INT < 23) {
            z3.a.G(TAG, "android_hyphenationFrequency only available since android 23");
        } else if (str != null && !str.equals("none")) {
            if (str.equals("full")) {
                oVar.setHyphenationFrequency(2);
            } else if (str.equals("normal")) {
                oVar.setHyphenationFrequency(1);
            } else {
                throw new JSApplicationIllegalArgumentException("Invalid android_hyphenationFrequency: " + str);
            }
        } else {
            oVar.setHyphenationFrequency(0);
        }
    }

    @w6.b(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor"})
    public void setBorderColor(o oVar, int i10, Integer num) {
        oVar.i(SPACING_TYPES[i10], num == null ? Float.NaN : num.intValue() & 16777215, num != null ? num.intValue() >>> 24 : Float.NaN);
    }

    @w6.b(defaultFloat = Float.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public void setBorderRadius(o oVar, int i10, float f10) {
        if (!com.facebook.yoga.g.a(f10)) {
            f10 = com.facebook.react.uimanager.r.c(f10);
        }
        if (i10 == 0) {
            oVar.setBorderRadius(f10);
        } else {
            oVar.j(f10, i10 - 1);
        }
    }

    @w6.a(name = "borderStyle")
    public void setBorderStyle(o oVar, String str) {
        oVar.setBorderStyle(str);
    }

    @w6.b(defaultFloat = Float.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth"})
    public void setBorderWidth(o oVar, int i10, float f10) {
        if (!com.facebook.yoga.g.a(f10)) {
            f10 = com.facebook.react.uimanager.r.c(f10);
        }
        oVar.k(SPACING_TYPES[i10], f10);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @w6.a(name = "dataDetectorType")
    public void setDataDetectorType(o oVar, String str) {
        char c10;
        switch (str.hashCode()) {
            case -1192969641:
                if (str.equals("phoneNumber")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 96673:
                if (str.equals("all")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 3321850:
                if (str.equals("link")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 3387192:
                if (str.equals("none")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 96619420:
                if (str.equals(Scopes.EMAIL)) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        if (c10 == 0) {
            oVar.setLinkifyMask(4);
        } else if (c10 == 1) {
            oVar.setLinkifyMask(1);
        } else if (c10 == 2) {
            oVar.setLinkifyMask(2);
        } else if (c10 != 3) {
            oVar.setLinkifyMask(0);
        } else {
            oVar.setLinkifyMask(15);
        }
    }

    @w6.a(defaultBoolean = false, name = "disabled")
    public void setDisabled(o oVar, boolean z10) {
        oVar.setEnabled(!z10);
    }

    @w6.a(name = "ellipsizeMode")
    public void setEllipsizeMode(o oVar, String str) {
        if (str != null && !str.equals("tail")) {
            if (str.equals("head")) {
                oVar.setEllipsizeLocation(TextUtils.TruncateAt.START);
                return;
            } else if (str.equals("middle")) {
                oVar.setEllipsizeLocation(TextUtils.TruncateAt.MIDDLE);
                return;
            } else if (str.equals("clip")) {
                oVar.setEllipsizeLocation(null);
                return;
            } else {
                throw new JSApplicationIllegalArgumentException("Invalid ellipsizeMode: " + str);
            }
        }
        oVar.setEllipsizeLocation(TextUtils.TruncateAt.END);
    }

    @w6.a(defaultBoolean = BuildConfig.SHOULD_GZIP_HTTP_REQUEST, name = "includeFontPadding")
    public void setIncludeFontPadding(o oVar, boolean z10) {
        oVar.setIncludeFontPadding(z10);
    }

    @w6.a(name = "onInlineViewLayout")
    public void setNotifyOnInlineViewLayout(o oVar, boolean z10) {
        oVar.setNotifyOnInlineViewLayout(z10);
    }

    @w6.a(defaultInt = Api.BaseClientBuilder.API_PRIORITY_OTHER, name = "numberOfLines")
    public void setNumberOfLines(o oVar, int i10) {
        oVar.setNumberOfLines(i10);
    }

    @w6.a(name = "selectable")
    public void setSelectable(o oVar, boolean z10) {
        oVar.setTextIsSelectable(z10);
    }

    @w6.a(customType = "Color", name = "selectionColor")
    public void setSelectionColor(o oVar, Integer num) {
        if (num == null) {
            oVar.setHighlightColor(d.c(oVar.getContext()));
        } else {
            oVar.setHighlightColor(num.intValue());
        }
    }

    @w6.a(name = "textAlignVertical")
    public void setTextAlignVertical(o oVar, String str) {
        if (str != null && !"auto".equals(str)) {
            if ("top".equals(str)) {
                oVar.setGravityVertical(48);
                return;
            } else if ("bottom".equals(str)) {
                oVar.setGravityVertical(80);
                return;
            } else if ("center".equals(str)) {
                oVar.setGravityVertical(16);
                return;
            } else {
                throw new JSApplicationIllegalArgumentException("Invalid textAlignVertical: " + str);
            }
        }
        oVar.setGravityVertical(0);
    }
}
