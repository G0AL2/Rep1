package com.inmobi.media;

import com.google.android.gms.common.internal.ImagesContract;
import fm.castbox.mediation.model.NetworkName;

/* compiled from: NativeWebViewAsset.java */
/* loaded from: classes3.dex */
public final class ch extends bt {
    public boolean A;
    public boolean B;

    /* renamed from: z  reason: collision with root package name */
    public String f24926z;

    public ch(String str, String str2, bu buVar, String str3, boolean z10) {
        super(str, str2, "WEBVIEW", buVar);
        this.A = false;
        this.f24813e = str3;
        this.B = z10;
    }

    public static String c(String str) {
        String trim = str.trim();
        trim.hashCode();
        char c10 = 65535;
        switch (trim.hashCode()) {
            case -1900324833:
                if (trim.equals("reference_html")) {
                    c10 = 0;
                    break;
                }
                break;
            case -835221992:
                if (trim.equals("reference_iframe")) {
                    c10 = 1;
                    break;
                }
                break;
            case 116079:
                if (trim.equals(ImagesContract.URL)) {
                    c10 = 2;
                    break;
                }
                break;
            case 3213227:
                if (trim.equals("html")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return "REF_HTML";
            case 1:
                return "REF_IFRAME";
            case 2:
                return "URL";
            case 3:
                return "HTML";
            default:
                return NetworkName.UNKNOWN;
        }
    }
}
