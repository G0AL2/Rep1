package l8;

import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import java.nio.ShortBuffer;
import java.util.Arrays;

/* compiled from: Sonic.java */
/* loaded from: classes2.dex */
final class i0 {

    /* renamed from: a  reason: collision with root package name */
    private final int f33835a;

    /* renamed from: b  reason: collision with root package name */
    private final int f33836b;

    /* renamed from: c  reason: collision with root package name */
    private final float f33837c;

    /* renamed from: d  reason: collision with root package name */
    private final float f33838d;

    /* renamed from: e  reason: collision with root package name */
    private final float f33839e;

    /* renamed from: f  reason: collision with root package name */
    private final int f33840f;

    /* renamed from: g  reason: collision with root package name */
    private final int f33841g;

    /* renamed from: h  reason: collision with root package name */
    private final int f33842h;

    /* renamed from: i  reason: collision with root package name */
    private final short[] f33843i;

    /* renamed from: j  reason: collision with root package name */
    private short[] f33844j;

    /* renamed from: k  reason: collision with root package name */
    private int f33845k;

    /* renamed from: l  reason: collision with root package name */
    private short[] f33846l;

    /* renamed from: m  reason: collision with root package name */
    private int f33847m;

    /* renamed from: n  reason: collision with root package name */
    private short[] f33848n;

    /* renamed from: o  reason: collision with root package name */
    private int f33849o;

    /* renamed from: p  reason: collision with root package name */
    private int f33850p;

    /* renamed from: q  reason: collision with root package name */
    private int f33851q;

    /* renamed from: r  reason: collision with root package name */
    private int f33852r;

    /* renamed from: s  reason: collision with root package name */
    private int f33853s;

    /* renamed from: t  reason: collision with root package name */
    private int f33854t;

    /* renamed from: u  reason: collision with root package name */
    private int f33855u;

    /* renamed from: v  reason: collision with root package name */
    private int f33856v;

    public i0(int i10, int i11, float f10, float f11, int i12) {
        this.f33835a = i10;
        this.f33836b = i11;
        this.f33837c = f10;
        this.f33838d = f11;
        this.f33839e = i10 / i12;
        this.f33840f = i10 / DownloadResource.STATUS_BAD_REQUEST;
        int i13 = i10 / 65;
        this.f33841g = i13;
        int i14 = i13 * 2;
        this.f33842h = i14;
        this.f33843i = new short[i14];
        this.f33844j = new short[i14 * i11];
        this.f33846l = new short[i14 * i11];
        this.f33848n = new short[i14 * i11];
    }

    private void a(float f10, int i10) {
        int i11;
        int i12;
        if (this.f33847m == i10) {
            return;
        }
        int i13 = this.f33835a;
        int i14 = (int) (i13 / f10);
        while (true) {
            if (i14 <= 16384 && i13 <= 16384) {
                break;
            }
            i14 /= 2;
            i13 /= 2;
        }
        o(i10);
        int i15 = 0;
        while (true) {
            int i16 = this.f33849o;
            if (i15 < i16 - 1) {
                while (true) {
                    i11 = this.f33850p;
                    int i17 = (i11 + 1) * i14;
                    i12 = this.f33851q;
                    if (i17 <= i12 * i13) {
                        break;
                    }
                    this.f33846l = f(this.f33846l, this.f33847m, 1);
                    int i18 = 0;
                    while (true) {
                        int i19 = this.f33836b;
                        if (i18 < i19) {
                            this.f33846l[(this.f33847m * i19) + i18] = n(this.f33848n, (i19 * i15) + i18, i13, i14);
                            i18++;
                        }
                    }
                    this.f33851q++;
                    this.f33847m++;
                }
                int i20 = i11 + 1;
                this.f33850p = i20;
                if (i20 == i13) {
                    this.f33850p = 0;
                    ea.a.f(i12 == i14);
                    this.f33851q = 0;
                }
                i15++;
            } else {
                u(i16 - 1);
                return;
            }
        }
    }

    private void b(float f10) {
        int m10;
        int i10 = this.f33845k;
        if (i10 < this.f33842h) {
            return;
        }
        int i11 = 0;
        do {
            if (this.f33852r > 0) {
                m10 = c(i11);
            } else {
                int g10 = g(this.f33844j, i11);
                if (f10 > 1.0d) {
                    m10 = g10 + w(this.f33844j, i11, f10, g10);
                } else {
                    m10 = m(this.f33844j, i11, f10, g10);
                }
            }
            i11 += m10;
        } while (this.f33842h + i11 <= i10);
        v(i11);
    }

    private int c(int i10) {
        int min = Math.min(this.f33842h, this.f33852r);
        d(this.f33844j, i10, min);
        this.f33852r -= min;
        return min;
    }

    private void d(short[] sArr, int i10, int i11) {
        short[] f10 = f(this.f33846l, this.f33847m, i11);
        this.f33846l = f10;
        int i12 = this.f33836b;
        System.arraycopy(sArr, i10 * i12, f10, this.f33847m * i12, i12 * i11);
        this.f33847m += i11;
    }

    private void e(short[] sArr, int i10, int i11) {
        int i12 = this.f33842h / i11;
        int i13 = this.f33836b;
        int i14 = i11 * i13;
        int i15 = i10 * i13;
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                i17 += sArr[(i16 * i14) + i15 + i18];
            }
            this.f33843i[i16] = (short) (i17 / i14);
        }
    }

    private short[] f(short[] sArr, int i10, int i11) {
        int length = sArr.length;
        int i12 = this.f33836b;
        int i13 = length / i12;
        return i10 + i11 <= i13 ? sArr : Arrays.copyOf(sArr, (((i13 * 3) / 2) + i11) * i12);
    }

    private int g(short[] sArr, int i10) {
        int i11;
        int i12 = this.f33835a;
        int i13 = i12 > 4000 ? i12 / TTAdSdk.INIT_LOCAL_FAIL_CODE : 1;
        if (this.f33836b == 1 && i13 == 1) {
            i11 = h(sArr, i10, this.f33840f, this.f33841g);
        } else {
            e(sArr, i10, i13);
            int h10 = h(this.f33843i, 0, this.f33840f / i13, this.f33841g / i13);
            if (i13 != 1) {
                int i14 = h10 * i13;
                int i15 = i13 * 4;
                int i16 = i14 - i15;
                int i17 = i14 + i15;
                int i18 = this.f33840f;
                if (i16 < i18) {
                    i16 = i18;
                }
                int i19 = this.f33841g;
                if (i17 > i19) {
                    i17 = i19;
                }
                if (this.f33836b == 1) {
                    i11 = h(sArr, i10, i16, i17);
                } else {
                    e(sArr, i10, 1);
                    i11 = h(this.f33843i, 0, i16, i17);
                }
            } else {
                i11 = h10;
            }
        }
        int i20 = q(this.f33855u, this.f33856v) ? this.f33853s : i11;
        this.f33854t = this.f33855u;
        this.f33853s = i11;
        return i20;
    }

    private int h(short[] sArr, int i10, int i11, int i12) {
        int i13 = i10 * this.f33836b;
        int i14 = 1;
        int i15 = 255;
        int i16 = 0;
        int i17 = 0;
        while (i11 <= i12) {
            int i18 = 0;
            for (int i19 = 0; i19 < i11; i19++) {
                i18 += Math.abs(sArr[i13 + i19] - sArr[(i13 + i11) + i19]);
            }
            if (i18 * i16 < i14 * i11) {
                i16 = i11;
                i14 = i18;
            }
            if (i18 * i15 > i17 * i11) {
                i15 = i11;
                i17 = i18;
            }
            i11++;
        }
        this.f33855u = i14 / i16;
        this.f33856v = i17 / i15;
        return i16;
    }

    private int m(short[] sArr, int i10, float f10, int i11) {
        int i12;
        if (f10 < 0.5f) {
            i12 = (int) ((i11 * f10) / (1.0f - f10));
        } else {
            this.f33852r = (int) ((i11 * ((2.0f * f10) - 1.0f)) / (1.0f - f10));
            i12 = i11;
        }
        int i13 = i11 + i12;
        short[] f11 = f(this.f33846l, this.f33847m, i13);
        this.f33846l = f11;
        int i14 = this.f33836b;
        System.arraycopy(sArr, i10 * i14, f11, this.f33847m * i14, i14 * i11);
        p(i12, this.f33836b, this.f33846l, this.f33847m + i11, sArr, i10 + i11, sArr, i10);
        this.f33847m += i13;
        return i12;
    }

    private short n(short[] sArr, int i10, int i11, int i12) {
        short s10 = sArr[i10];
        short s11 = sArr[i10 + this.f33836b];
        int i13 = this.f33851q * i11;
        int i14 = this.f33850p;
        int i15 = i14 * i12;
        int i16 = (i14 + 1) * i12;
        int i17 = i16 - i13;
        int i18 = i16 - i15;
        return (short) (((s10 * i17) + ((i18 - i17) * s11)) / i18);
    }

    private void o(int i10) {
        int i11 = this.f33847m - i10;
        short[] f10 = f(this.f33848n, this.f33849o, i11);
        this.f33848n = f10;
        short[] sArr = this.f33846l;
        int i12 = this.f33836b;
        System.arraycopy(sArr, i10 * i12, f10, this.f33849o * i12, i12 * i11);
        this.f33847m = i10;
        this.f33849o += i11;
    }

    private static void p(int i10, int i11, short[] sArr, int i12, short[] sArr2, int i13, short[] sArr3, int i14) {
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = (i12 * i11) + i15;
            int i17 = (i14 * i11) + i15;
            int i18 = (i13 * i11) + i15;
            for (int i19 = 0; i19 < i10; i19++) {
                sArr[i16] = (short) (((sArr2[i18] * (i10 - i19)) + (sArr3[i17] * i19)) / i10);
                i16 += i11;
                i18 += i11;
                i17 += i11;
            }
        }
    }

    private boolean q(int i10, int i11) {
        return i10 != 0 && this.f33853s != 0 && i11 <= i10 * 3 && i10 * 2 > this.f33854t * 3;
    }

    private void r() {
        int i10 = this.f33847m;
        float f10 = this.f33837c;
        float f11 = this.f33838d;
        float f12 = f10 / f11;
        float f13 = this.f33839e * f11;
        double d10 = f12;
        if (d10 <= 1.00001d && d10 >= 0.99999d) {
            d(this.f33844j, 0, this.f33845k);
            this.f33845k = 0;
        } else {
            b(f12);
        }
        if (f13 != 1.0f) {
            a(f13, i10);
        }
    }

    private void u(int i10) {
        if (i10 == 0) {
            return;
        }
        short[] sArr = this.f33848n;
        int i11 = this.f33836b;
        System.arraycopy(sArr, i10 * i11, sArr, 0, (this.f33849o - i10) * i11);
        this.f33849o -= i10;
    }

    private void v(int i10) {
        int i11 = this.f33845k - i10;
        short[] sArr = this.f33844j;
        int i12 = this.f33836b;
        System.arraycopy(sArr, i10 * i12, sArr, 0, i12 * i11);
        this.f33845k = i11;
    }

    private int w(short[] sArr, int i10, float f10, int i11) {
        int i12;
        if (f10 >= 2.0f) {
            i12 = (int) (i11 / (f10 - 1.0f));
        } else {
            this.f33852r = (int) ((i11 * (2.0f - f10)) / (f10 - 1.0f));
            i12 = i11;
        }
        short[] f11 = f(this.f33846l, this.f33847m, i12);
        this.f33846l = f11;
        p(i12, this.f33836b, f11, this.f33847m, sArr, i10, sArr, i10 + i11);
        this.f33847m += i12;
        return i12;
    }

    public void i() {
        this.f33845k = 0;
        this.f33847m = 0;
        this.f33849o = 0;
        this.f33850p = 0;
        this.f33851q = 0;
        this.f33852r = 0;
        this.f33853s = 0;
        this.f33854t = 0;
        this.f33855u = 0;
        this.f33856v = 0;
    }

    public void j(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.f33836b, this.f33847m);
        shortBuffer.put(this.f33846l, 0, this.f33836b * min);
        int i10 = this.f33847m - min;
        this.f33847m = i10;
        short[] sArr = this.f33846l;
        int i11 = this.f33836b;
        System.arraycopy(sArr, min * i11, sArr, 0, i10 * i11);
    }

    public int k() {
        return this.f33847m * this.f33836b * 2;
    }

    public int l() {
        return this.f33845k * this.f33836b * 2;
    }

    public void s() {
        int i10;
        int i11 = this.f33845k;
        float f10 = this.f33837c;
        float f11 = this.f33838d;
        int i12 = this.f33847m + ((int) ((((i11 / (f10 / f11)) + this.f33849o) / (this.f33839e * f11)) + 0.5f));
        this.f33844j = f(this.f33844j, i11, (this.f33842h * 2) + i11);
        int i13 = 0;
        while (true) {
            i10 = this.f33842h;
            int i14 = this.f33836b;
            if (i13 >= i10 * 2 * i14) {
                break;
            }
            this.f33844j[(i14 * i11) + i13] = 0;
            i13++;
        }
        this.f33845k += i10 * 2;
        r();
        if (this.f33847m > i12) {
            this.f33847m = i12;
        }
        this.f33845k = 0;
        this.f33852r = 0;
        this.f33849o = 0;
    }

    public void t(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i10 = this.f33836b;
        int i11 = remaining / i10;
        short[] f10 = f(this.f33844j, this.f33845k, i11);
        this.f33844j = f10;
        shortBuffer.get(f10, this.f33845k * this.f33836b, ((i10 * i11) * 2) / 2);
        this.f33845k += i11;
        r();
    }
}
