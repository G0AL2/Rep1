package i9;

import java.util.Arrays;
import java.util.Random;

/* compiled from: ShuffleOrder.java */
/* loaded from: classes2.dex */
public interface q0 {

    /* compiled from: ShuffleOrder.java */
    /* loaded from: classes2.dex */
    public static class a implements q0 {

        /* renamed from: a  reason: collision with root package name */
        private final Random f31776a;

        /* renamed from: b  reason: collision with root package name */
        private final int[] f31777b;

        /* renamed from: c  reason: collision with root package name */
        private final int[] f31778c;

        public a(int i10) {
            this(i10, new Random());
        }

        private static int[] a(int i10, Random random) {
            int[] iArr = new int[i10];
            int i11 = 0;
            while (i11 < i10) {
                int i12 = i11 + 1;
                int nextInt = random.nextInt(i12);
                iArr[i11] = iArr[nextInt];
                iArr[nextInt] = i11;
                i11 = i12;
            }
            return iArr;
        }

        @Override // i9.q0
        public int b() {
            return this.f31777b.length;
        }

        @Override // i9.q0
        public q0 c(int i10, int i11) {
            int i12 = i11 - i10;
            int[] iArr = new int[this.f31777b.length - i12];
            int i13 = 0;
            int i14 = 0;
            while (true) {
                int[] iArr2 = this.f31777b;
                if (i13 < iArr2.length) {
                    if (iArr2[i13] < i10 || iArr2[i13] >= i11) {
                        iArr[i13 - i14] = iArr2[i13] >= i10 ? iArr2[i13] - i12 : iArr2[i13];
                    } else {
                        i14++;
                    }
                    i13++;
                } else {
                    return new a(iArr, new Random(this.f31776a.nextLong()));
                }
            }
        }

        @Override // i9.q0
        public int d(int i10) {
            int i11 = this.f31778c[i10] - 1;
            if (i11 >= 0) {
                return this.f31777b[i11];
            }
            return -1;
        }

        @Override // i9.q0
        public int e(int i10) {
            int i11 = this.f31778c[i10] + 1;
            int[] iArr = this.f31777b;
            if (i11 < iArr.length) {
                return iArr[i11];
            }
            return -1;
        }

        @Override // i9.q0
        public int f() {
            int[] iArr = this.f31777b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override // i9.q0
        public q0 g() {
            return new a(0, new Random(this.f31776a.nextLong()));
        }

        @Override // i9.q0
        public int h() {
            int[] iArr = this.f31777b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override // i9.q0
        public q0 i(int i10, int i11) {
            int[] iArr = new int[i11];
            int[] iArr2 = new int[i11];
            int i12 = 0;
            int i13 = 0;
            while (i13 < i11) {
                iArr[i13] = this.f31776a.nextInt(this.f31777b.length + 1);
                int i14 = i13 + 1;
                int nextInt = this.f31776a.nextInt(i14);
                iArr2[i13] = iArr2[nextInt];
                iArr2[nextInt] = i13 + i10;
                i13 = i14;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[this.f31777b.length + i11];
            int i15 = 0;
            int i16 = 0;
            while (true) {
                int[] iArr4 = this.f31777b;
                if (i12 < iArr4.length + i11) {
                    if (i15 < i11 && i16 == iArr[i15]) {
                        iArr3[i12] = iArr2[i15];
                        i15++;
                    } else {
                        int i17 = i16 + 1;
                        iArr3[i12] = iArr4[i16];
                        if (iArr3[i12] >= i10) {
                            iArr3[i12] = iArr3[i12] + i11;
                        }
                        i16 = i17;
                    }
                    i12++;
                } else {
                    return new a(iArr3, new Random(this.f31776a.nextLong()));
                }
            }
        }

        private a(int i10, Random random) {
            this(a(i10, random), random);
        }

        private a(int[] iArr, Random random) {
            this.f31777b = iArr;
            this.f31776a = random;
            this.f31778c = new int[iArr.length];
            for (int i10 = 0; i10 < iArr.length; i10++) {
                this.f31778c[iArr[i10]] = i10;
            }
        }
    }

    int b();

    q0 c(int i10, int i11);

    int d(int i10);

    int e(int i10);

    int f();

    q0 g();

    int h();

    q0 i(int i10, int i11);
}
