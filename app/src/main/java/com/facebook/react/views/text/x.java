package com.facebook.react.views.text;

import android.content.Context;
import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.LruCache;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.uimanager.f0;
import com.facebook.react.uimanager.t;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: TextLayoutManager.java */
/* loaded from: classes.dex */
public class x {

    /* renamed from: a  reason: collision with root package name */
    private static final String f16278a = "x";

    /* renamed from: b  reason: collision with root package name */
    private static final TextPaint f16279b = new TextPaint(1);

    /* renamed from: c  reason: collision with root package name */
    private static final Object f16280c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static final LruCache<ReadableNativeMap, Spannable> f16281d = new LruCache<>(100);

    /* renamed from: e  reason: collision with root package name */
    private static final ConcurrentHashMap<Integer, Spannable> f16282e = new ConcurrentHashMap<>();

    /* compiled from: TextLayoutManager.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        protected int f16283a;

        /* renamed from: b  reason: collision with root package name */
        protected int f16284b;

        /* renamed from: c  reason: collision with root package name */
        protected j f16285c;

        public a(int i10, int i11, j jVar) {
            this.f16283a = i10;
            this.f16284b = i11;
            this.f16285c = jVar;
        }

        public void a(Spannable spannable, int i10) {
            int i11 = this.f16283a;
            spannable.setSpan(this.f16285c, i11, this.f16284b, ((i10 << 16) & 16711680) | ((i11 == 0 ? 18 : 34) & (-16711681)));
        }
    }

    private static void a(Context context, ReadableArray readableArray, SpannableStringBuilder spannableStringBuilder, List<a> list) {
        int i10;
        int i11 = 0;
        for (int size = readableArray.size(); i11 < size; size = i10) {
            ReadableMap map = readableArray.getMap(i11);
            int length = spannableStringBuilder.length();
            t a10 = t.a(new f0(map.getMap("textAttributes")));
            spannableStringBuilder.append((CharSequence) z.a(map.getString("string"), a10.f16255k));
            int length2 = spannableStringBuilder.length();
            int i12 = map.hasKey("reactTag") ? map.getInt("reactTag") : -1;
            if (map.hasKey("isAttachment") && map.getBoolean("isAttachment")) {
                list.add(new a(spannableStringBuilder.length() - 1, spannableStringBuilder.length(), new w(i12, (int) com.facebook.react.uimanager.r.d(map.getDouble("width")), (int) com.facebook.react.uimanager.r.d(map.getDouble("height")))));
            } else if (length2 >= length) {
                if (t.d.LINK.equals(a10.f16262r)) {
                    list.add(new a(length, length2, new g(i12, a10.f16248d)));
                } else if (a10.f16246b) {
                    list.add(new a(length, length2, new ReactForegroundColorSpan(a10.f16248d)));
                }
                if (a10.f16249e) {
                    list.add(new a(length, length2, new ReactBackgroundColorSpan(a10.f16250f)));
                }
                if (!Float.isNaN(a10.k())) {
                    list.add(new a(length, length2, new com.facebook.react.views.text.a(a10.k())));
                }
                list.add(new a(length, length2, new ReactAbsoluteSizeSpan(a10.f16251g)));
                if (a10.f16263s == -1 && a10.f16264t == -1 && a10.f16265u == null) {
                    i10 = size;
                } else {
                    i10 = size;
                    list.add(new a(length, length2, new c(a10.f16263s, a10.f16264t, a10.f16266v, a10.f16265u, context.getAssets())));
                }
                if (a10.f16260p) {
                    list.add(new a(length, length2, new ReactUnderlineSpan()));
                }
                if (a10.f16261q) {
                    list.add(new a(length, length2, new ReactStrikethroughSpan()));
                }
                if (a10.f16256l != 0.0f || a10.f16257m != 0.0f) {
                    list.add(new a(length, length2, new s(a10.f16256l, a10.f16257m, a10.f16258n, a10.f16259o)));
                }
                if (!Float.isNaN(a10.e())) {
                    list.add(new a(length, length2, new b(a10.e())));
                }
                list.add(new a(length, length2, new k(i12)));
                i11++;
            }
            i10 = size;
            i11++;
        }
    }

    private static Layout b(Spannable spannable, BoringLayout.Metrics metrics, float f10, com.facebook.yoga.n nVar, boolean z10, int i10, int i11) {
        int i12;
        int length = spannable.length();
        boolean z11 = nVar == com.facebook.yoga.n.UNDEFINED || f10 < 0.0f;
        TextPaint textPaint = f16279b;
        float desiredWidth = metrics == null ? Layout.getDesiredWidth(spannable, textPaint) : Float.NaN;
        if (metrics == null && (z11 || (!com.facebook.yoga.g.a(desiredWidth) && desiredWidth <= f10))) {
            int ceil = (int) Math.ceil(desiredWidth);
            if (Build.VERSION.SDK_INT < 23) {
                return new StaticLayout(spannable, textPaint, ceil, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, z10);
            }
            return StaticLayout.Builder.obtain(spannable, 0, length, textPaint, ceil).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(0.0f, 1.0f).setIncludePad(z10).setBreakStrategy(i10).setHyphenationFrequency(i11).build();
        } else if (metrics != null && (z11 || metrics.width <= f10)) {
            int i13 = metrics.width;
            if (i13 < 0) {
                String str = f16278a;
                ReactSoftExceptionLogger.logSoftException(str, new ReactNoCrashSoftException("Text width is invalid: " + metrics.width));
                i12 = 0;
            } else {
                i12 = i13;
            }
            return BoringLayout.make(spannable, textPaint, i12, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, metrics, z10);
        } else {
            int i14 = Build.VERSION.SDK_INT;
            if (i14 < 23) {
                return new StaticLayout(spannable, textPaint, (int) f10, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, z10);
            }
            StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(spannable, 0, length, textPaint, (int) f10).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(0.0f, 1.0f).setIncludePad(z10).setBreakStrategy(i10).setHyphenationFrequency(i11);
            if (i14 >= 28) {
                hyphenationFrequency.setUseLineSpacingFromFallbacks(true);
            }
            return hyphenationFrequency.build();
        }
    }

    private static Spannable c(Context context, ReadableMap readableMap, p pVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayList<a> arrayList = new ArrayList();
        a(context, readableMap.getArray("fragments"), spannableStringBuilder, arrayList);
        int i10 = 0;
        for (a aVar : arrayList) {
            aVar.a(spannableStringBuilder, i10);
            i10++;
        }
        if (pVar != null) {
            pVar.a(spannableStringBuilder);
        }
        return spannableStringBuilder;
    }

    public static void d(int i10) {
        f16282e.remove(Integer.valueOf(i10));
    }

    public static Spannable e(Context context, ReadableMap readableMap, p pVar) {
        Object obj = f16280c;
        synchronized (obj) {
            LruCache<ReadableNativeMap, Spannable> lruCache = f16281d;
            Spannable spannable = lruCache.get((ReadableNativeMap) readableMap);
            if (spannable != null) {
                return spannable;
            }
            Spannable c10 = c(context, readableMap, pVar);
            synchronized (obj) {
                lruCache.put((ReadableNativeMap) readableMap, c10);
            }
            return c10;
        }
    }

    public static boolean f(ReadableMap readableMap) {
        ReadableArray array = readableMap.getArray("fragments");
        return array.size() > 0 && t.j(array.getMap(0).getMap("textAttributes").getString("layoutDirection")) == 1;
    }

    public static WritableArray g(Context context, ReadableMap readableMap, ReadableMap readableMap2, float f10) {
        TextPaint textPaint = f16279b;
        Spannable e10 = e(context, readableMap, null);
        return e.a(e10, b(e10, BoringLayout.isBoring(e10, textPaint), f10, com.facebook.yoga.n.EXACTLY, readableMap2.hasKey("includeFontPadding") ? readableMap2.getBoolean("includeFontPadding") : true, t.n(readableMap2.getString("textBreakStrategy")), t.n(readableMap2.getString("android_hyphenationFrequency"))), textPaint, context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a7, code lost:
        if (r3 > r21) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00bb, code lost:
        if (r1 > r23) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0151, code lost:
        if (r6 != false) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long h(android.content.Context r18, com.facebook.react.bridge.ReadableMap r19, com.facebook.react.bridge.ReadableMap r20, float r21, com.facebook.yoga.n r22, float r23, com.facebook.yoga.n r24, com.facebook.react.views.text.p r25, float[] r26) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.text.x.h(android.content.Context, com.facebook.react.bridge.ReadableMap, com.facebook.react.bridge.ReadableMap, float, com.facebook.yoga.n, float, com.facebook.yoga.n, com.facebook.react.views.text.p, float[]):long");
    }

    public static void i(int i10, Spannable spannable) {
        f16282e.put(Integer.valueOf(i10), spannable);
    }
}
