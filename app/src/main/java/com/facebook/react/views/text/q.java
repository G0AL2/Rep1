package com.facebook.react.views.text;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.text.TextUtils;
import com.facebook.react.bridge.ReadableArray;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import java.util.ArrayList;

/* compiled from: ReactTypefaceUtils.java */
/* loaded from: classes.dex */
public class q {
    public static Typeface a(Typeface typeface, int i10, int i11, String str, AssetManager assetManager) {
        a0 a0Var = new a0(i10, i11);
        if (str == null) {
            if (typeface == null) {
                typeface = Typeface.DEFAULT;
            }
            return a0Var.a(typeface);
        }
        return h.b().d(str, a0Var, assetManager);
    }

    public static int b(String str) {
        if (str != null) {
            if ("italic".equals(str)) {
                return 2;
            }
            return "normal".equals(str) ? 0 : -1;
        }
        return -1;
    }

    public static String c(ReadableArray readableArray) {
        if (readableArray == null || readableArray.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < readableArray.size(); i10++) {
            String string = readableArray.getString(i10);
            if (string != null) {
                char c10 = 65535;
                switch (string.hashCode()) {
                    case -1195362251:
                        if (string.equals("proportional-nums")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case -1061392823:
                        if (string.equals("lining-nums")) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case -771984547:
                        if (string.equals("tabular-nums")) {
                            c10 = 2;
                            break;
                        }
                        break;
                    case -659678800:
                        if (string.equals("oldstyle-nums")) {
                            c10 = 3;
                            break;
                        }
                        break;
                    case 1183323111:
                        if (string.equals("small-caps")) {
                            c10 = 4;
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 0:
                        arrayList.add("'pnum'");
                        continue;
                    case 1:
                        arrayList.add("'lnum'");
                        continue;
                    case 2:
                        arrayList.add("'tnum'");
                        continue;
                    case 3:
                        arrayList.add("'onum'");
                        continue;
                    case 4:
                        arrayList.add("'smcp'");
                        continue;
                }
            }
        }
        return TextUtils.join(", ", arrayList);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int d(String str) {
        char c10;
        if (str != null) {
            switch (str.hashCode()) {
                case -1039745817:
                    if (str.equals("normal")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 48625:
                    if (str.equals("100")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 49586:
                    if (str.equals("200")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 50547:
                    if (str.equals("300")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 51508:
                    if (str.equals("400")) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 52469:
                    if (str.equals("500")) {
                        c10 = 5;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 53430:
                    if (str.equals("600")) {
                        c10 = 6;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 54391:
                    if (str.equals("700")) {
                        c10 = 7;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 55352:
                    if (str.equals("800")) {
                        c10 = '\b';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 56313:
                    if (str.equals("900")) {
                        c10 = '\t';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3029637:
                    if (str.equals("bold")) {
                        c10 = '\n';
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            switch (c10) {
                case 0:
                case 4:
                    return DownloadResource.STATUS_BAD_REQUEST;
                case 1:
                    return 100;
                case 2:
                    return 200;
                case 3:
                    return ms.bd.o.Pgl.c.COLLECT_MODE_FINANCE;
                case 5:
                    return 500;
                case 6:
                    return 600;
                case 7:
                case '\n':
                    return 700;
                case '\b':
                    return 800;
                case '\t':
                    return 900;
            }
        }
        return -1;
    }
}
