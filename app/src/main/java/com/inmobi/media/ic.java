package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.TextView;
import java.util.HashMap;
import java.util.Map;

/* compiled from: DisplayInfo.java */
/* loaded from: classes3.dex */
public class ic {

    /* renamed from: a  reason: collision with root package name */
    private static final String f25739a = "ic";

    /* renamed from: b  reason: collision with root package name */
    private static String f25740b;

    /* compiled from: DisplayInfo.java */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f25743a;

        /* renamed from: b  reason: collision with root package name */
        public int f25744b;

        public a(int i10, int i11) {
            this.f25743a = i10;
            this.f25744b = i11;
        }

        public final String toString() {
            return "Size{width=" + this.f25743a + ", height=" + this.f25744b + '}';
        }
    }

    public static int b(int i10) {
        return Math.round(i10 / a().f25747c);
    }

    public static Map<String, String> c() {
        String str;
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("d-device-screen-density", String.valueOf(a().f25747c));
            id a10 = a();
            hashMap.put("d-device-screen-size", a10.f25745a + "X" + a10.f25746b);
            Context c10 = ho.c();
            if (c10 == null) {
                str = "0x0";
            } else {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                ((WindowManager) c10.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
                str = displayMetrics.widthPixels + "x" + displayMetrics.heightPixels;
            }
            hashMap.put("d-density-dependent-screen-size", str);
            hashMap.put("d-orientation", String.valueOf((int) b()));
            hashMap.put("d-textsize", String.valueOf(new TextView(ho.c()).getTextSize()));
        } catch (Exception unused) {
        }
        return hashMap;
    }

    public static String d() {
        String str = f25740b;
        if (str != null) {
            return str;
        }
        Context c10 = ho.c();
        String b10 = c10 == null ? null : hf.a(c10, "gesture_info_store").b("gesture_margin");
        f25740b = b10;
        return b10;
    }

    public static int a(int i10) {
        return Math.round(i10 * a().f25747c);
    }

    public static byte b() {
        Context c10 = ho.c();
        if (c10 == null) {
            return (byte) 1;
        }
        int rotation = ((WindowManager) c10.getSystemService("window")).getDefaultDisplay().getRotation();
        if (rotation != 1) {
            if (rotation != 2) {
                return rotation != 3 ? (byte) 1 : (byte) 4;
            }
            return (byte) 2;
        }
        return (byte) 3;
    }

    public static id a() {
        Context c10 = ho.c();
        if (c10 == null) {
            return new id(0, 0, 2.0f);
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) c10.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        float f10 = displayMetrics.density;
        return new id(Math.round(displayMetrics.widthPixels / f10), Math.round(displayMetrics.heightPixels / f10), f10);
    }

    public static a b(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return new a(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    public static void a(Context context) {
        Window window;
        WindowInsets rootWindowInsets;
        if (!(context instanceof Activity) || (window = ((Activity) context).getWindow()) == null || (rootWindowInsets = window.getDecorView().getRootWindowInsets()) == null) {
            return;
        }
        a(context, rootWindowInsets);
    }

    public static void a(final Context context, final WindowInsets windowInsets) {
        ho.a(new Runnable() { // from class: com.inmobi.media.ic.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    String[] split = windowInsets.getSystemGestureInsets().toString().split("Insets");
                    StringBuffer stringBuffer = new StringBuffer();
                    if (split.length > 1) {
                        String[] split2 = split[1].replaceAll("[^0-9,=a-zA-Z]*", "").split(",");
                        stringBuffer.append("{");
                        for (int i10 = 0; i10 < split2.length; i10++) {
                            String[] split3 = split2[i10].split("=");
                            if (split3.length == 2) {
                                stringBuffer.append("\"" + split3[0] + "\"");
                                stringBuffer.append(":");
                                stringBuffer.append(ic.b(Integer.parseInt(split3[1])));
                                if (i10 < split2.length - 1) {
                                    stringBuffer.append(", ");
                                }
                            }
                        }
                        stringBuffer.append("}");
                    }
                    if (stringBuffer.length() > 0) {
                        String unused = ic.f25740b = stringBuffer.toString();
                        hf.a(context, "gesture_info_store").a("gesture_margin", stringBuffer.toString());
                    }
                } catch (Exception unused2) {
                    String unused3 = ic.f25739a;
                }
            }
        });
    }
}
