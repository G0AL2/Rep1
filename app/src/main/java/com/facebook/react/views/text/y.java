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
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.common.mapbuffer.ReadableMapBuffer;
import com.facebook.react.uimanager.t;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: TextLayoutManagerMapBuffer.java */
/* loaded from: classes.dex */
public class y {

    /* renamed from: a  reason: collision with root package name */
    private static final String f16286a = "y";

    /* renamed from: b  reason: collision with root package name */
    private static final TextPaint f16287b = new TextPaint(1);

    /* renamed from: c  reason: collision with root package name */
    private static final Object f16288c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static final LruCache<ReadableMapBuffer, Spannable> f16289d = new LruCache<>(100);

    /* renamed from: e  reason: collision with root package name */
    private static final ConcurrentHashMap<Integer, Spannable> f16290e = new ConcurrentHashMap<>();

    /* compiled from: TextLayoutManagerMapBuffer.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        protected int f16291a;

        /* renamed from: b  reason: collision with root package name */
        protected int f16292b;

        /* renamed from: c  reason: collision with root package name */
        protected j f16293c;

        public a(int i10, int i11, j jVar) {
            this.f16291a = i10;
            this.f16292b = i11;
            this.f16293c = jVar;
        }

        public void a(Spannable spannable, int i10) {
            int i11 = this.f16291a;
            spannable.setSpan(this.f16293c, i11, this.f16292b, ((i10 << 16) & 16711680) | ((i11 == 0 ? 18 : 34) & (-16711681)));
        }
    }

    private static void a(Context context, ReadableMapBuffer readableMapBuffer, SpannableStringBuilder spannableStringBuilder, List<a> list) {
        int count = readableMapBuffer.getCount();
        for (int i10 = 0; i10 < count; i10++) {
            ReadableMapBuffer o10 = readableMapBuffer.o(i10);
            int length = spannableStringBuilder.length();
            t b10 = t.b(o10.o(5));
            spannableStringBuilder.append((CharSequence) z.a(o10.q(0), b10.f16255k));
            int length2 = spannableStringBuilder.length();
            int m10 = o10.s(1) ? o10.m(1) : -1;
            if (o10.s(2) && o10.j(2)) {
                list.add(new a(spannableStringBuilder.length() - 1, spannableStringBuilder.length(), new w(m10, (int) com.facebook.react.uimanager.r.d(o10.l(3)), (int) com.facebook.react.uimanager.r.d(o10.l(4)))));
            } else if (length2 >= length) {
                if (t.d.LINK.equals(b10.f16262r)) {
                    list.add(new a(length, length2, new g(m10, b10.f16248d)));
                } else if (b10.f16246b) {
                    list.add(new a(length, length2, new ReactForegroundColorSpan(b10.f16248d)));
                }
                if (b10.f16249e) {
                    list.add(new a(length, length2, new ReactBackgroundColorSpan(b10.f16250f)));
                }
                if (!Float.isNaN(b10.k())) {
                    list.add(new a(length, length2, new com.facebook.react.views.text.a(b10.k())));
                }
                list.add(new a(length, length2, new ReactAbsoluteSizeSpan(b10.f16251g)));
                if (b10.f16263s != -1 || b10.f16264t != -1 || b10.f16265u != null) {
                    list.add(new a(length, length2, new c(b10.f16263s, b10.f16264t, b10.f16266v, b10.f16265u, context.getAssets())));
                }
                if (b10.f16260p) {
                    list.add(new a(length, length2, new ReactUnderlineSpan()));
                }
                if (b10.f16261q) {
                    list.add(new a(length, length2, new ReactStrikethroughSpan()));
                }
                if (b10.f16256l != 0.0f || b10.f16257m != 0.0f) {
                    list.add(new a(length, length2, new s(b10.f16256l, b10.f16257m, b10.f16258n, b10.f16259o)));
                }
                if (!Float.isNaN(b10.e())) {
                    list.add(new a(length, length2, new b(b10.e())));
                }
                list.add(new a(length, length2, new k(m10)));
            }
        }
    }

    private static Layout b(Spannable spannable, BoringLayout.Metrics metrics, float f10, com.facebook.yoga.n nVar, boolean z10, int i10, int i11) {
        int i12;
        int length = spannable.length();
        boolean z11 = nVar == com.facebook.yoga.n.UNDEFINED || f10 < 0.0f;
        TextPaint textPaint = f16287b;
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
                String str = f16286a;
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

    private static Spannable c(Context context, ReadableMapBuffer readableMapBuffer, p pVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayList<a> arrayList = new ArrayList();
        a(context, readableMapBuffer.o(2), spannableStringBuilder, arrayList);
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

    public static Spannable d(Context context, ReadableMapBuffer readableMapBuffer, p pVar) {
        Object obj = f16288c;
        synchronized (obj) {
            LruCache<ReadableMapBuffer, Spannable> lruCache = f16289d;
            Spannable spannable = lruCache.get(readableMapBuffer);
            if (spannable != null) {
                return spannable;
            }
            Spannable c10 = c(context, readableMapBuffer, pVar);
            synchronized (obj) {
                lruCache.put(readableMapBuffer, c10);
            }
            return c10;
        }
    }

    public static boolean e(ReadableMapBuffer readableMapBuffer) {
        ReadableMapBuffer o10 = readableMapBuffer.o(2);
        return o10.getCount() != 0 && t.j(o10.o(0).o(5).q(21)) == 1;
    }

    public static WritableArray f(Context context, ReadableMapBuffer readableMapBuffer, ReadableMapBuffer readableMapBuffer2, float f10) {
        TextPaint textPaint = f16287b;
        Spannable d10 = d(context, readableMapBuffer, null);
        return e.a(d10, b(d10, BoringLayout.isBoring(d10, textPaint), f10, com.facebook.yoga.n.EXACTLY, readableMapBuffer2.s(4) ? readableMapBuffer2.j(4) : true, t.n(readableMapBuffer2.q(2)), t.n(readableMapBuffer2.q(5))), textPaint, context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ad, code lost:
        if (r12 > r21) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c1, code lost:
        if (r1 > r23) goto L89;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long g(android.content.Context r18, com.facebook.react.common.mapbuffer.ReadableMapBuffer r19, com.facebook.react.common.mapbuffer.ReadableMapBuffer r20, float r21, com.facebook.yoga.n r22, float r23, com.facebook.yoga.n r24, com.facebook.react.views.text.p r25, float[] r26) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.text.y.g(android.content.Context, com.facebook.react.common.mapbuffer.ReadableMapBuffer, com.facebook.react.common.mapbuffer.ReadableMapBuffer, float, com.facebook.yoga.n, float, com.facebook.yoga.n, com.facebook.react.views.text.p, float[]):long");
    }
}
