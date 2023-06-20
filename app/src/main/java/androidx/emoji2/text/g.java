package androidx.emoji2.text;

import android.os.Build;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import androidx.emoji2.text.d;
import androidx.emoji2.text.l;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EmojiProcessor.java */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private final d.i f2915a;

    /* renamed from: b  reason: collision with root package name */
    private final l f2916b;

    /* renamed from: c  reason: collision with root package name */
    private d.InterfaceC0057d f2917c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f2918d;

    /* renamed from: e  reason: collision with root package name */
    private final int[] f2919e;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: EmojiProcessor.java */
    /* loaded from: classes.dex */
    public static final class a {
        static int a(CharSequence charSequence, int i10, int i11) {
            int length = charSequence.length();
            if (i10 < 0 || length < i10 || i11 < 0) {
                return -1;
            }
            while (true) {
                boolean z10 = false;
                while (i11 != 0) {
                    i10--;
                    if (i10 < 0) {
                        return z10 ? -1 : 0;
                    }
                    char charAt = charSequence.charAt(i10);
                    if (z10) {
                        if (!Character.isHighSurrogate(charAt)) {
                            return -1;
                        }
                        i11--;
                    } else if (!Character.isSurrogate(charAt)) {
                        i11--;
                    } else if (Character.isHighSurrogate(charAt)) {
                        return -1;
                    } else {
                        z10 = true;
                    }
                }
                return i10;
            }
        }

        static int b(CharSequence charSequence, int i10, int i11) {
            int length = charSequence.length();
            if (i10 < 0 || length < i10 || i11 < 0) {
                return -1;
            }
            while (true) {
                boolean z10 = false;
                while (i11 != 0) {
                    if (i10 >= length) {
                        if (z10) {
                            return -1;
                        }
                        return length;
                    }
                    char charAt = charSequence.charAt(i10);
                    if (z10) {
                        if (!Character.isLowSurrogate(charAt)) {
                            return -1;
                        }
                        i11--;
                        i10++;
                    } else if (!Character.isSurrogate(charAt)) {
                        i11--;
                        i10++;
                    } else if (Character.isLowSurrogate(charAt)) {
                        return -1;
                    } else {
                        i10++;
                        z10 = true;
                    }
                }
                return i10;
            }
        }
    }

    /* compiled from: EmojiProcessor.java */
    /* loaded from: classes.dex */
    public static class b implements d.InterfaceC0057d {

        /* renamed from: b  reason: collision with root package name */
        private static final ThreadLocal<StringBuilder> f2920b = new ThreadLocal<>();

        /* renamed from: a  reason: collision with root package name */
        private final TextPaint f2921a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b() {
            TextPaint textPaint = new TextPaint();
            this.f2921a = textPaint;
            textPaint.setTextSize(10.0f);
        }

        private static StringBuilder b() {
            ThreadLocal<StringBuilder> threadLocal = f2920b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            return threadLocal.get();
        }

        @Override // androidx.emoji2.text.d.InterfaceC0057d
        public boolean a(CharSequence charSequence, int i10, int i11, int i12) {
            int i13 = Build.VERSION.SDK_INT;
            if (i13 >= 23 || i12 <= i13) {
                StringBuilder b10 = b();
                b10.setLength(0);
                while (i10 < i11) {
                    b10.append(charSequence.charAt(i10));
                    i10++;
                }
                return z.c.a(this.f2921a, b10.toString());
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EmojiProcessor.java */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private int f2922a = 1;

        /* renamed from: b  reason: collision with root package name */
        private final l.a f2923b;

        /* renamed from: c  reason: collision with root package name */
        private l.a f2924c;

        /* renamed from: d  reason: collision with root package name */
        private l.a f2925d;

        /* renamed from: e  reason: collision with root package name */
        private int f2926e;

        /* renamed from: f  reason: collision with root package name */
        private int f2927f;

        /* renamed from: g  reason: collision with root package name */
        private final boolean f2928g;

        /* renamed from: h  reason: collision with root package name */
        private final int[] f2929h;

        c(l.a aVar, boolean z10, int[] iArr) {
            this.f2923b = aVar;
            this.f2924c = aVar;
            this.f2928g = z10;
            this.f2929h = iArr;
        }

        private static boolean d(int i10) {
            return i10 == 65039;
        }

        private static boolean f(int i10) {
            return i10 == 65038;
        }

        private int g() {
            this.f2922a = 1;
            this.f2924c = this.f2923b;
            this.f2927f = 0;
            return 1;
        }

        private boolean h() {
            if (this.f2924c.b().j() || d(this.f2926e)) {
                return true;
            }
            if (this.f2928g) {
                if (this.f2929h == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.f2929h, this.f2924c.b().b(0)) < 0) {
                    return true;
                }
            }
            return false;
        }

        int a(int i10) {
            l.a a10 = this.f2924c.a(i10);
            int i11 = 3;
            if (this.f2922a == 2) {
                if (a10 != null) {
                    this.f2924c = a10;
                    this.f2927f++;
                } else if (f(i10)) {
                    i11 = g();
                } else if (!d(i10)) {
                    if (this.f2924c.b() != null) {
                        if (this.f2927f == 1) {
                            if (h()) {
                                this.f2925d = this.f2924c;
                                g();
                            } else {
                                i11 = g();
                            }
                        } else {
                            this.f2925d = this.f2924c;
                            g();
                        }
                    } else {
                        i11 = g();
                    }
                }
                i11 = 2;
            } else if (a10 == null) {
                i11 = g();
            } else {
                this.f2922a = 2;
                this.f2924c = a10;
                this.f2927f = 1;
                i11 = 2;
            }
            this.f2926e = i10;
            return i11;
        }

        f b() {
            return this.f2924c.b();
        }

        f c() {
            return this.f2925d.b();
        }

        boolean e() {
            return this.f2922a == 2 && this.f2924c.b() != null && (this.f2927f > 1 || h());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(l lVar, d.i iVar, d.InterfaceC0057d interfaceC0057d, boolean z10, int[] iArr) {
        this.f2915a = iVar;
        this.f2916b = lVar;
        this.f2917c = interfaceC0057d;
        this.f2918d = z10;
        this.f2919e = iArr;
    }

    private void a(Spannable spannable, f fVar, int i10, int i11) {
        spannable.setSpan(this.f2915a.a(fVar), i10, i11, 33);
    }

    private static boolean b(Editable editable, KeyEvent keyEvent, boolean z10) {
        h[] hVarArr;
        if (g(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!f(selectionStart, selectionEnd) && (hVarArr = (h[]) editable.getSpans(selectionStart, selectionEnd, h.class)) != null && hVarArr.length > 0) {
            for (h hVar : hVarArr) {
                int spanStart = editable.getSpanStart(hVar);
                int spanEnd = editable.getSpanEnd(hVar);
                if ((z10 && spanStart == selectionStart) || ((!z10 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c(InputConnection inputConnection, Editable editable, int i10, int i11, boolean z10) {
        int max;
        int min;
        if (editable != null && inputConnection != null && i10 >= 0 && i11 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (f(selectionStart, selectionEnd)) {
                return false;
            }
            if (z10) {
                max = a.a(editable, selectionStart, Math.max(i10, 0));
                min = a.b(editable, selectionEnd, Math.max(i11, 0));
                if (max == -1 || min == -1) {
                    return false;
                }
            } else {
                max = Math.max(selectionStart - i10, 0);
                min = Math.min(selectionEnd + i11, editable.length());
            }
            h[] hVarArr = (h[]) editable.getSpans(max, min, h.class);
            if (hVarArr != null && hVarArr.length > 0) {
                for (h hVar : hVarArr) {
                    int spanStart = editable.getSpanStart(hVar);
                    int spanEnd = editable.getSpanEnd(hVar);
                    max = Math.min(spanStart, max);
                    min = Math.max(spanEnd, min);
                }
                int max2 = Math.max(max, 0);
                int min2 = Math.min(min, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(max2, min2);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d(Editable editable, int i10, KeyEvent keyEvent) {
        boolean b10;
        if (i10 != 67) {
            b10 = i10 != 112 ? false : b(editable, keyEvent, true);
        } else {
            b10 = b(editable, keyEvent, false);
        }
        if (b10) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            return true;
        }
        return false;
    }

    private boolean e(CharSequence charSequence, int i10, int i11, f fVar) {
        if (fVar.d() == 0) {
            fVar.k(this.f2917c.a(charSequence, i10, i11, fVar.h()));
        }
        return fVar.d() == 2;
    }

    private static boolean f(int i10, int i11) {
        return i10 == -1 || i11 == -1 || i10 != i11;
    }

    private static boolean g(KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x010f, code lost:
        ((androidx.emoji2.text.m) r10).d();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0042 A[Catch: all -> 0x0116, TryCatch #0 {all -> 0x0116, blocks: (B:7:0x000d, B:10:0x0012, B:12:0x0016, B:14:0x0025, B:18:0x0031, B:20:0x003b, B:22:0x003e, B:24:0x0042, B:26:0x004e, B:27:0x0051, B:29:0x005e, B:35:0x006d, B:36:0x007b, B:40:0x0096, B:48:0x00a6, B:51:0x00b2, B:52:0x00b7, B:53:0x00c1, B:55:0x00c8, B:56:0x00cd, B:58:0x00d8, B:60:0x00df, B:64:0x00e9, B:67:0x00f5, B:68:0x00fb, B:15:0x002b), top: B:81:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f5 A[Catch: all -> 0x0116, TryCatch #0 {all -> 0x0116, blocks: (B:7:0x000d, B:10:0x0012, B:12:0x0016, B:14:0x0025, B:18:0x0031, B:20:0x003b, B:22:0x003e, B:24:0x0042, B:26:0x004e, B:27:0x0051, B:29:0x005e, B:35:0x006d, B:36:0x007b, B:40:0x0096, B:48:0x00a6, B:51:0x00b2, B:52:0x00b7, B:53:0x00c1, B:55:0x00c8, B:56:0x00cd, B:58:0x00d8, B:60:0x00df, B:64:0x00e9, B:67:0x00f5, B:68:0x00fb, B:15:0x002b), top: B:81:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0107 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00cd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x009d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.CharSequence h(java.lang.CharSequence r10, int r11, int r12, int r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.g.h(java.lang.CharSequence, int, int, int, boolean):java.lang.CharSequence");
    }
}
