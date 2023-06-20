package t9;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import ea.n0;
import ea.r;
import ea.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import r9.b;

/* compiled from: DvbParser.java */
/* loaded from: classes2.dex */
final class b {

    /* renamed from: h  reason: collision with root package name */
    private static final byte[] f37187h = {0, 7, 8, 15};

    /* renamed from: i  reason: collision with root package name */
    private static final byte[] f37188i = {0, 119, -120, -1};

    /* renamed from: j  reason: collision with root package name */
    private static final byte[] f37189j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: a  reason: collision with root package name */
    private final Paint f37190a;

    /* renamed from: b  reason: collision with root package name */
    private final Paint f37191b;

    /* renamed from: c  reason: collision with root package name */
    private final Canvas f37192c;

    /* renamed from: d  reason: collision with root package name */
    private final C0505b f37193d;

    /* renamed from: e  reason: collision with root package name */
    private final a f37194e;

    /* renamed from: f  reason: collision with root package name */
    private final h f37195f;

    /* renamed from: g  reason: collision with root package name */
    private Bitmap f37196g;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DvbParser.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f37197a;

        /* renamed from: b  reason: collision with root package name */
        public final int[] f37198b;

        /* renamed from: c  reason: collision with root package name */
        public final int[] f37199c;

        /* renamed from: d  reason: collision with root package name */
        public final int[] f37200d;

        public a(int i10, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f37197a = i10;
            this.f37198b = iArr;
            this.f37199c = iArr2;
            this.f37200d = iArr3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DvbParser.java */
    /* renamed from: t9.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0505b {

        /* renamed from: a  reason: collision with root package name */
        public final int f37201a;

        /* renamed from: b  reason: collision with root package name */
        public final int f37202b;

        /* renamed from: c  reason: collision with root package name */
        public final int f37203c;

        /* renamed from: d  reason: collision with root package name */
        public final int f37204d;

        /* renamed from: e  reason: collision with root package name */
        public final int f37205e;

        /* renamed from: f  reason: collision with root package name */
        public final int f37206f;

        public C0505b(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f37201a = i10;
            this.f37202b = i11;
            this.f37203c = i12;
            this.f37204d = i13;
            this.f37205e = i14;
            this.f37206f = i15;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DvbParser.java */
    /* loaded from: classes2.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f37207a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f37208b;

        /* renamed from: c  reason: collision with root package name */
        public final byte[] f37209c;

        /* renamed from: d  reason: collision with root package name */
        public final byte[] f37210d;

        public c(int i10, boolean z10, byte[] bArr, byte[] bArr2) {
            this.f37207a = i10;
            this.f37208b = z10;
            this.f37209c = bArr;
            this.f37210d = bArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DvbParser.java */
    /* loaded from: classes2.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final int f37211a;

        /* renamed from: b  reason: collision with root package name */
        public final int f37212b;

        /* renamed from: c  reason: collision with root package name */
        public final SparseArray<e> f37213c;

        public d(int i10, int i11, int i12, SparseArray<e> sparseArray) {
            this.f37211a = i11;
            this.f37212b = i12;
            this.f37213c = sparseArray;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DvbParser.java */
    /* loaded from: classes2.dex */
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        public final int f37214a;

        /* renamed from: b  reason: collision with root package name */
        public final int f37215b;

        public e(int i10, int i11) {
            this.f37214a = i10;
            this.f37215b = i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DvbParser.java */
    /* loaded from: classes2.dex */
    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        public final int f37216a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f37217b;

        /* renamed from: c  reason: collision with root package name */
        public final int f37218c;

        /* renamed from: d  reason: collision with root package name */
        public final int f37219d;

        /* renamed from: e  reason: collision with root package name */
        public final int f37220e;

        /* renamed from: f  reason: collision with root package name */
        public final int f37221f;

        /* renamed from: g  reason: collision with root package name */
        public final int f37222g;

        /* renamed from: h  reason: collision with root package name */
        public final int f37223h;

        /* renamed from: i  reason: collision with root package name */
        public final int f37224i;

        /* renamed from: j  reason: collision with root package name */
        public final SparseArray<g> f37225j;

        public f(int i10, boolean z10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, SparseArray<g> sparseArray) {
            this.f37216a = i10;
            this.f37217b = z10;
            this.f37218c = i11;
            this.f37219d = i12;
            this.f37220e = i14;
            this.f37221f = i15;
            this.f37222g = i16;
            this.f37223h = i17;
            this.f37224i = i18;
            this.f37225j = sparseArray;
        }

        public void a(f fVar) {
            SparseArray<g> sparseArray = fVar.f37225j;
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                this.f37225j.put(sparseArray.keyAt(i10), sparseArray.valueAt(i10));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DvbParser.java */
    /* loaded from: classes2.dex */
    public static final class g {

        /* renamed from: a  reason: collision with root package name */
        public final int f37226a;

        /* renamed from: b  reason: collision with root package name */
        public final int f37227b;

        public g(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f37226a = i12;
            this.f37227b = i13;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DvbParser.java */
    /* loaded from: classes2.dex */
    public static final class h {

        /* renamed from: a  reason: collision with root package name */
        public final int f37228a;

        /* renamed from: b  reason: collision with root package name */
        public final int f37229b;

        /* renamed from: c  reason: collision with root package name */
        public final SparseArray<f> f37230c = new SparseArray<>();

        /* renamed from: d  reason: collision with root package name */
        public final SparseArray<a> f37231d = new SparseArray<>();

        /* renamed from: e  reason: collision with root package name */
        public final SparseArray<c> f37232e = new SparseArray<>();

        /* renamed from: f  reason: collision with root package name */
        public final SparseArray<a> f37233f = new SparseArray<>();

        /* renamed from: g  reason: collision with root package name */
        public final SparseArray<c> f37234g = new SparseArray<>();

        /* renamed from: h  reason: collision with root package name */
        public C0505b f37235h;

        /* renamed from: i  reason: collision with root package name */
        public d f37236i;

        public h(int i10, int i11) {
            this.f37228a = i10;
            this.f37229b = i11;
        }

        public void a() {
            this.f37230c.clear();
            this.f37231d.clear();
            this.f37232e.clear();
            this.f37233f.clear();
            this.f37234g.clear();
            this.f37235h = null;
            this.f37236i = null;
        }
    }

    public b(int i10, int i11) {
        Paint paint = new Paint();
        this.f37190a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f37191b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f37192c = new Canvas();
        this.f37193d = new C0505b(719, 575, 0, 719, 0, 575);
        this.f37194e = new a(0, c(), d(), e());
        this.f37195f = new h(i10, i11);
    }

    private static byte[] a(int i10, int i11, z zVar) {
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) zVar.h(i11);
        }
        return bArr;
    }

    private static int[] c() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    private static int[] d() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i10 = 1; i10 < 16; i10++) {
            if (i10 < 8) {
                iArr[i10] = f(255, (i10 & 1) != 0 ? 255 : 0, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i10] = f(255, (i10 & 1) != 0 ? 127 : 0, (i10 & 2) != 0 ? 127 : 0, (i10 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    private static int[] e() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i10 = 0; i10 < 256; i10++) {
            if (i10 < 8) {
                iArr[i10] = f(63, (i10 & 1) != 0 ? 255 : 0, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) == 0 ? 0 : 255);
            } else {
                int i11 = i10 & 136;
                if (i11 == 0) {
                    iArr[i10] = f(255, ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i11 == 8) {
                    iArr[i10] = f(127, ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i11 == 128) {
                    iArr[i10] = f(255, ((i10 & 1) != 0 ? 43 : 0) + 127 + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + 127 + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + 127 + ((i10 & 64) == 0 ? 0 : 85));
                } else if (i11 == 136) {
                    iArr[i10] = f(255, ((i10 & 1) != 0 ? 43 : 0) + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + ((i10 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    private static int f(int i10, int i11, int i12, int i13) {
        return (i10 << 24) | (i11 << 16) | (i12 << 8) | i13;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0063 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0083 A[LOOP:0: B:3:0x0009->B:33:0x0083, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0082 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int g(ea.z r13, int[] r14, byte[] r15, int r16, int r17, android.graphics.Paint r18, android.graphics.Canvas r19) {
        /*
            r0 = r13
            r1 = r17
            r8 = r18
            r9 = 0
            r10 = r16
            r2 = 0
        L9:
            r3 = 2
            int r4 = r13.h(r3)
            r5 = 1
            if (r4 == 0) goto L14
            r11 = r2
        L12:
            r12 = 1
            goto L61
        L14:
            boolean r4 = r13.g()
            r6 = 3
            if (r4 == 0) goto L28
            int r4 = r13.h(r6)
            int r4 = r4 + r6
            int r3 = r13.h(r3)
        L24:
            r11 = r2
            r12 = r4
            r4 = r3
            goto L61
        L28:
            boolean r4 = r13.g()
            if (r4 == 0) goto L31
            r11 = r2
            r4 = 0
            goto L12
        L31:
            int r4 = r13.h(r3)
            if (r4 == 0) goto L5e
            if (r4 == r5) goto L5a
            if (r4 == r3) goto L4e
            if (r4 == r6) goto L41
            r11 = r2
            r4 = 0
        L3f:
            r12 = 0
            goto L61
        L41:
            r4 = 8
            int r4 = r13.h(r4)
            int r4 = r4 + 29
            int r3 = r13.h(r3)
            goto L24
        L4e:
            r4 = 4
            int r4 = r13.h(r4)
            int r4 = r4 + 12
            int r3 = r13.h(r3)
            goto L24
        L5a:
            r11 = r2
            r4 = 0
            r12 = 2
            goto L61
        L5e:
            r4 = 0
            r11 = 1
            goto L3f
        L61:
            if (r12 == 0) goto L7f
            if (r8 == 0) goto L7f
            if (r15 == 0) goto L69
            r4 = r15[r4]
        L69:
            r2 = r14[r4]
            r8.setColor(r2)
            float r3 = (float) r10
            float r4 = (float) r1
            int r2 = r10 + r12
            float r6 = (float) r2
            int r2 = r1 + 1
            float r7 = (float) r2
            r2 = r19
            r5 = r6
            r6 = r7
            r7 = r18
            r2.drawRect(r3, r4, r5, r6, r7)
        L7f:
            int r10 = r10 + r12
            if (r11 == 0) goto L83
            return r10
        L83:
            r2 = r11
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: t9.b.g(ea.z, int[], byte[], int, int, android.graphics.Paint, android.graphics.Canvas):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008e A[LOOP:0: B:3:0x0009->B:36:0x008e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int h(ea.z r13, int[] r14, byte[] r15, int r16, int r17, android.graphics.Paint r18, android.graphics.Canvas r19) {
        /*
            r0 = r13
            r1 = r17
            r8 = r18
            r9 = 0
            r10 = r16
            r2 = 0
        L9:
            r3 = 4
            int r4 = r13.h(r3)
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L16
            r11 = r2
        L13:
            r12 = 1
            goto L6e
        L16:
            boolean r4 = r13.g()
            r7 = 3
            if (r4 != 0) goto L2c
            int r3 = r13.h(r7)
            if (r3 == 0) goto L29
            int r5 = r3 + 2
            r11 = r2
            r12 = r5
            r4 = 0
            goto L6e
        L29:
            r4 = 0
            r11 = 1
            goto L4d
        L2c:
            boolean r4 = r13.g()
            if (r4 != 0) goto L3f
            int r4 = r13.h(r5)
            int r5 = r4 + 4
            int r4 = r13.h(r3)
        L3c:
            r11 = r2
            r12 = r5
            goto L6e
        L3f:
            int r4 = r13.h(r5)
            if (r4 == 0) goto L6b
            if (r4 == r6) goto L67
            if (r4 == r5) goto L5c
            if (r4 == r7) goto L4f
            r11 = r2
            r4 = 0
        L4d:
            r12 = 0
            goto L6e
        L4f:
            r4 = 8
            int r4 = r13.h(r4)
            int r5 = r4 + 25
            int r4 = r13.h(r3)
            goto L3c
        L5c:
            int r4 = r13.h(r3)
            int r5 = r4 + 9
            int r4 = r13.h(r3)
            goto L3c
        L67:
            r11 = r2
            r4 = 0
            r12 = 2
            goto L6e
        L6b:
            r11 = r2
            r4 = 0
            goto L13
        L6e:
            if (r12 == 0) goto L8a
            if (r8 == 0) goto L8a
            if (r15 == 0) goto L76
            r4 = r15[r4]
        L76:
            r2 = r14[r4]
            r8.setColor(r2)
            float r3 = (float) r10
            float r4 = (float) r1
            int r2 = r10 + r12
            float r5 = (float) r2
            int r2 = r1 + 1
            float r6 = (float) r2
            r2 = r19
            r7 = r18
            r2.drawRect(r3, r4, r5, r6, r7)
        L8a:
            int r10 = r10 + r12
            if (r11 == 0) goto L8e
            return r10
        L8e:
            r2 = r11
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: t9.b.h(ea.z, int[], byte[], int, int, android.graphics.Paint, android.graphics.Canvas):int");
    }

    private static int i(z zVar, int[] iArr, byte[] bArr, int i10, int i11, Paint paint, Canvas canvas) {
        boolean z10;
        int h10;
        int i12 = i10;
        boolean z11 = false;
        while (true) {
            byte h11 = zVar.h(8);
            if (h11 != 0) {
                z10 = z11;
                h10 = 1;
            } else if (!zVar.g()) {
                int h12 = zVar.h(7);
                if (h12 != 0) {
                    z10 = z11;
                    h10 = h12;
                    h11 = 0;
                } else {
                    h11 = 0;
                    z10 = true;
                    h10 = 0;
                }
            } else {
                z10 = z11;
                h10 = zVar.h(7);
                h11 = zVar.h(8);
            }
            if (h10 != 0 && paint != null) {
                if (bArr != null) {
                    h11 = bArr[h11];
                }
                paint.setColor(iArr[h11]);
                canvas.drawRect(i12, i11, i12 + h10, i11 + 1, paint);
            }
            i12 += h10;
            if (z10) {
                return i12;
            }
            z11 = z10;
        }
    }

    private static void j(byte[] bArr, int[] iArr, int i10, int i11, int i12, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        z zVar = new z(bArr);
        int i13 = i11;
        int i14 = i12;
        byte[] bArr5 = null;
        byte[] bArr6 = null;
        byte[] bArr7 = null;
        while (zVar.b() != 0) {
            int h10 = zVar.h(8);
            if (h10 != 240) {
                switch (h10) {
                    case 16:
                        if (i10 == 3) {
                            bArr3 = bArr5 == null ? f37188i : bArr5;
                        } else if (i10 == 2) {
                            bArr3 = bArr7 == null ? f37187h : bArr7;
                        } else {
                            bArr2 = null;
                            i13 = g(zVar, iArr, bArr2, i13, i14, paint, canvas);
                            zVar.c();
                            continue;
                        }
                        bArr2 = bArr3;
                        i13 = g(zVar, iArr, bArr2, i13, i14, paint, canvas);
                        zVar.c();
                        continue;
                    case 17:
                        if (i10 == 3) {
                            bArr4 = bArr6 == null ? f37189j : bArr6;
                        } else {
                            bArr4 = null;
                        }
                        i13 = h(zVar, iArr, bArr4, i13, i14, paint, canvas);
                        zVar.c();
                        continue;
                    case 18:
                        i13 = i(zVar, iArr, null, i13, i14, paint, canvas);
                        continue;
                    default:
                        switch (h10) {
                            case 32:
                                bArr7 = a(4, 4, zVar);
                                continue;
                            case 33:
                                bArr5 = a(4, 8, zVar);
                                continue;
                            case 34:
                                bArr6 = a(16, 8, zVar);
                                continue;
                            default:
                                continue;
                        }
                }
            } else {
                i14 += 2;
                i13 = i11;
            }
        }
    }

    private static void k(c cVar, a aVar, int i10, int i11, int i12, Paint paint, Canvas canvas) {
        int[] iArr;
        if (i10 == 3) {
            iArr = aVar.f37200d;
        } else if (i10 == 2) {
            iArr = aVar.f37199c;
        } else {
            iArr = aVar.f37198b;
        }
        int[] iArr2 = iArr;
        j(cVar.f37209c, iArr2, i10, i11, i12, paint, canvas);
        j(cVar.f37210d, iArr2, i10, i11, i12 + 1, paint, canvas);
    }

    private static a l(z zVar, int i10) {
        int h10;
        int i11;
        int h11;
        int h12;
        int i12;
        int i13 = 8;
        int h13 = zVar.h(8);
        zVar.r(8);
        int i14 = 2;
        int i15 = i10 - 2;
        int[] c10 = c();
        int[] d10 = d();
        int[] e10 = e();
        while (i15 > 0) {
            int h14 = zVar.h(i13);
            int h15 = zVar.h(i13);
            int i16 = i15 - 2;
            int[] iArr = (h15 & 128) != 0 ? c10 : (h15 & 64) != 0 ? d10 : e10;
            if ((h15 & 1) != 0) {
                h12 = zVar.h(i13);
                i12 = zVar.h(i13);
                h10 = zVar.h(i13);
                h11 = zVar.h(i13);
                i11 = i16 - 4;
            } else {
                int h16 = zVar.h(4) << 4;
                h10 = zVar.h(4) << 4;
                i11 = i16 - 2;
                h11 = zVar.h(i14) << 6;
                h12 = zVar.h(6) << i14;
                i12 = h16;
            }
            if (h12 == 0) {
                i12 = 0;
                h10 = 0;
                h11 = 255;
            }
            double d11 = h12;
            double d12 = i12 - 128;
            double d13 = h10 - 128;
            iArr[h14] = f((byte) (255 - (h11 & 255)), n0.q((int) (d11 + (1.402d * d12)), 0, 255), n0.q((int) ((d11 - (0.34414d * d13)) - (d12 * 0.71414d)), 0, 255), n0.q((int) (d11 + (d13 * 1.772d)), 0, 255));
            i15 = i11;
            h13 = h13;
            i13 = 8;
            i14 = 2;
        }
        return new a(h13, c10, d10, e10);
    }

    private static C0505b m(z zVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        zVar.r(4);
        boolean g10 = zVar.g();
        zVar.r(3);
        int h10 = zVar.h(16);
        int h11 = zVar.h(16);
        if (g10) {
            int h12 = zVar.h(16);
            int h13 = zVar.h(16);
            int h14 = zVar.h(16);
            i11 = zVar.h(16);
            i10 = h13;
            i13 = h14;
            i12 = h12;
        } else {
            i10 = h10;
            i11 = h11;
            i12 = 0;
            i13 = 0;
        }
        return new C0505b(h10, h11, i12, i10, i13, i11);
    }

    private static c n(z zVar) {
        byte[] bArr;
        int h10 = zVar.h(16);
        zVar.r(4);
        int h11 = zVar.h(2);
        boolean g10 = zVar.g();
        zVar.r(1);
        byte[] bArr2 = n0.f29714f;
        if (h11 == 1) {
            zVar.r(zVar.h(8) * 16);
        } else if (h11 == 0) {
            int h12 = zVar.h(16);
            int h13 = zVar.h(16);
            if (h12 > 0) {
                bArr2 = new byte[h12];
                zVar.k(bArr2, 0, h12);
            }
            if (h13 > 0) {
                bArr = new byte[h13];
                zVar.k(bArr, 0, h13);
                return new c(h10, g10, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new c(h10, g10, bArr2, bArr);
    }

    private static d o(z zVar, int i10) {
        int h10 = zVar.h(8);
        int h11 = zVar.h(4);
        int h12 = zVar.h(2);
        zVar.r(2);
        int i11 = i10 - 2;
        SparseArray sparseArray = new SparseArray();
        while (i11 > 0) {
            int h13 = zVar.h(8);
            zVar.r(8);
            i11 -= 6;
            sparseArray.put(h13, new e(zVar.h(16), zVar.h(16)));
        }
        return new d(h10, h11, h12, sparseArray);
    }

    private static f p(z zVar, int i10) {
        int h10;
        int h11;
        int h12 = zVar.h(8);
        zVar.r(4);
        boolean g10 = zVar.g();
        zVar.r(3);
        int i11 = 16;
        int h13 = zVar.h(16);
        int h14 = zVar.h(16);
        int h15 = zVar.h(3);
        int h16 = zVar.h(3);
        int i12 = 2;
        zVar.r(2);
        int h17 = zVar.h(8);
        int h18 = zVar.h(8);
        int h19 = zVar.h(4);
        int h20 = zVar.h(2);
        zVar.r(2);
        int i13 = i10 - 10;
        SparseArray sparseArray = new SparseArray();
        while (i13 > 0) {
            int h21 = zVar.h(i11);
            int h22 = zVar.h(i12);
            int h23 = zVar.h(i12);
            int h24 = zVar.h(12);
            int i14 = h20;
            zVar.r(4);
            int h25 = zVar.h(12);
            i13 -= 6;
            if (h22 == 1 || h22 == 2) {
                i13 -= 2;
                h10 = zVar.h(8);
                h11 = zVar.h(8);
            } else {
                h10 = 0;
                h11 = 0;
            }
            sparseArray.put(h21, new g(h22, h23, h24, h25, h10, h11));
            h20 = i14;
            i12 = 2;
            i11 = 16;
        }
        return new f(h12, g10, h13, h14, h15, h16, h17, h18, h19, h20, sparseArray);
    }

    private static void q(z zVar, h hVar) {
        f fVar;
        int h10 = zVar.h(8);
        int h11 = zVar.h(16);
        int h12 = zVar.h(16);
        int d10 = zVar.d() + h12;
        if (h12 * 8 > zVar.b()) {
            r.h("DvbParser", "Data field length exceeds limit");
            zVar.r(zVar.b());
            return;
        }
        switch (h10) {
            case 16:
                if (h11 == hVar.f37228a) {
                    d dVar = hVar.f37236i;
                    d o10 = o(zVar, h12);
                    if (o10.f37212b != 0) {
                        hVar.f37236i = o10;
                        hVar.f37230c.clear();
                        hVar.f37231d.clear();
                        hVar.f37232e.clear();
                        break;
                    } else if (dVar != null && dVar.f37211a != o10.f37211a) {
                        hVar.f37236i = o10;
                        break;
                    }
                }
                break;
            case 17:
                d dVar2 = hVar.f37236i;
                if (h11 == hVar.f37228a && dVar2 != null) {
                    f p10 = p(zVar, h12);
                    if (dVar2.f37212b == 0 && (fVar = hVar.f37230c.get(p10.f37216a)) != null) {
                        p10.a(fVar);
                    }
                    hVar.f37230c.put(p10.f37216a, p10);
                    break;
                }
                break;
            case 18:
                if (h11 == hVar.f37228a) {
                    a l10 = l(zVar, h12);
                    hVar.f37231d.put(l10.f37197a, l10);
                    break;
                } else if (h11 == hVar.f37229b) {
                    a l11 = l(zVar, h12);
                    hVar.f37233f.put(l11.f37197a, l11);
                    break;
                }
                break;
            case 19:
                if (h11 == hVar.f37228a) {
                    c n10 = n(zVar);
                    hVar.f37232e.put(n10.f37207a, n10);
                    break;
                } else if (h11 == hVar.f37229b) {
                    c n11 = n(zVar);
                    hVar.f37234g.put(n11.f37207a, n11);
                    break;
                }
                break;
            case 20:
                if (h11 == hVar.f37228a) {
                    hVar.f37235h = m(zVar);
                    break;
                }
                break;
        }
        zVar.s(d10 - zVar.d());
    }

    public List<r9.b> b(byte[] bArr, int i10) {
        int i11;
        int i12;
        SparseArray<g> sparseArray;
        z zVar = new z(bArr, i10);
        while (zVar.b() >= 48 && zVar.h(8) == 15) {
            q(zVar, this.f37195f);
        }
        h hVar = this.f37195f;
        d dVar = hVar.f37236i;
        if (dVar == null) {
            return Collections.emptyList();
        }
        C0505b c0505b = hVar.f37235h;
        if (c0505b == null) {
            c0505b = this.f37193d;
        }
        Bitmap bitmap = this.f37196g;
        if (bitmap == null || c0505b.f37201a + 1 != bitmap.getWidth() || c0505b.f37202b + 1 != this.f37196g.getHeight()) {
            Bitmap createBitmap = Bitmap.createBitmap(c0505b.f37201a + 1, c0505b.f37202b + 1, Bitmap.Config.ARGB_8888);
            this.f37196g = createBitmap;
            this.f37192c.setBitmap(createBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<e> sparseArray2 = dVar.f37213c;
        for (int i13 = 0; i13 < sparseArray2.size(); i13++) {
            this.f37192c.save();
            e valueAt = sparseArray2.valueAt(i13);
            f fVar = this.f37195f.f37230c.get(sparseArray2.keyAt(i13));
            int i14 = valueAt.f37214a + c0505b.f37203c;
            int i15 = valueAt.f37215b + c0505b.f37205e;
            this.f37192c.clipRect(i14, i15, Math.min(fVar.f37218c + i14, c0505b.f37204d), Math.min(fVar.f37219d + i15, c0505b.f37206f));
            a aVar = this.f37195f.f37231d.get(fVar.f37221f);
            if (aVar == null && (aVar = this.f37195f.f37233f.get(fVar.f37221f)) == null) {
                aVar = this.f37194e;
            }
            SparseArray<g> sparseArray3 = fVar.f37225j;
            int i16 = 0;
            while (i16 < sparseArray3.size()) {
                int keyAt = sparseArray3.keyAt(i16);
                g valueAt2 = sparseArray3.valueAt(i16);
                c cVar = this.f37195f.f37232e.get(keyAt);
                c cVar2 = cVar == null ? this.f37195f.f37234g.get(keyAt) : cVar;
                if (cVar2 != null) {
                    i12 = i16;
                    sparseArray = sparseArray3;
                    k(cVar2, aVar, fVar.f37220e, valueAt2.f37226a + i14, i15 + valueAt2.f37227b, cVar2.f37208b ? null : this.f37190a, this.f37192c);
                } else {
                    i12 = i16;
                    sparseArray = sparseArray3;
                }
                i16 = i12 + 1;
                sparseArray3 = sparseArray;
            }
            if (fVar.f37217b) {
                int i17 = fVar.f37220e;
                if (i17 == 3) {
                    i11 = aVar.f37200d[fVar.f37222g];
                } else if (i17 == 2) {
                    i11 = aVar.f37199c[fVar.f37223h];
                } else {
                    i11 = aVar.f37198b[fVar.f37224i];
                }
                this.f37191b.setColor(i11);
                this.f37192c.drawRect(i14, i15, fVar.f37218c + i14, fVar.f37219d + i15, this.f37191b);
            }
            arrayList.add(new b.C0490b().f(Bitmap.createBitmap(this.f37196g, i14, i15, fVar.f37218c, fVar.f37219d)).k(i14 / c0505b.f37201a).l(0).h(i15 / c0505b.f37202b, 0).i(0).n(fVar.f37218c / c0505b.f37201a).g(fVar.f37219d / c0505b.f37202b).a());
            this.f37192c.drawColor(0, PorterDuff.Mode.CLEAR);
            this.f37192c.restore();
        }
        return Collections.unmodifiableList(arrayList);
    }

    public void r() {
        this.f37195f.a();
    }
}
