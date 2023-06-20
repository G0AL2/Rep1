package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final int f18068a;

    /* renamed from: b  reason: collision with root package name */
    public final int f18069b;

    /* renamed from: c  reason: collision with root package name */
    public final int f18070c;

    /* renamed from: d  reason: collision with root package name */
    public final int f18071d;

    /* renamed from: e  reason: collision with root package name */
    public final int f18072e;

    /* renamed from: f  reason: collision with root package name */
    public final short[] f18073f;

    /* renamed from: g  reason: collision with root package name */
    public int f18074g;

    /* renamed from: h  reason: collision with root package name */
    public short[] f18075h;

    /* renamed from: i  reason: collision with root package name */
    public int f18076i;

    /* renamed from: j  reason: collision with root package name */
    public short[] f18077j;

    /* renamed from: k  reason: collision with root package name */
    public int f18078k;

    /* renamed from: l  reason: collision with root package name */
    public short[] f18079l;

    /* renamed from: q  reason: collision with root package name */
    public int f18084q;

    /* renamed from: r  reason: collision with root package name */
    public int f18085r;

    /* renamed from: s  reason: collision with root package name */
    public int f18086s;

    /* renamed from: t  reason: collision with root package name */
    public int f18087t;

    /* renamed from: v  reason: collision with root package name */
    public int f18089v;

    /* renamed from: w  reason: collision with root package name */
    public int f18090w;

    /* renamed from: x  reason: collision with root package name */
    public int f18091x;

    /* renamed from: m  reason: collision with root package name */
    public int f18080m = 0;

    /* renamed from: n  reason: collision with root package name */
    public int f18081n = 0;

    /* renamed from: u  reason: collision with root package name */
    public int f18088u = 0;

    /* renamed from: o  reason: collision with root package name */
    public float f18082o = 1.0f;

    /* renamed from: p  reason: collision with root package name */
    public float f18083p = 1.0f;

    public g(int i10, int i11) {
        this.f18068a = i10;
        this.f18069b = i11;
        this.f18070c = i10 / DownloadResource.STATUS_BAD_REQUEST;
        int i12 = i10 / 65;
        this.f18071d = i12;
        int i13 = i12 * 2;
        this.f18072e = i13;
        this.f18073f = new short[i13];
        this.f18074g = i13;
        int i14 = i11 * i13;
        this.f18075h = new short[i14];
        this.f18076i = i13;
        this.f18077j = new short[i14];
        this.f18078k = i13;
        this.f18079l = new short[i14];
    }

    public final void a(int i10) {
        int i11 = this.f18084q + i10;
        int i12 = this.f18074g;
        if (i11 > i12) {
            int i13 = i12 + (i12 / 2) + i10;
            this.f18074g = i13;
            this.f18075h = Arrays.copyOf(this.f18075h, i13 * this.f18069b);
        }
    }

    public final void b(int i10) {
        int i11 = this.f18085r + i10;
        int i12 = this.f18076i;
        if (i11 > i12) {
            int i13 = i12 + (i12 / 2) + i10;
            this.f18076i = i13;
            this.f18077j = Arrays.copyOf(this.f18077j, i13 * this.f18069b);
        }
    }

    public final void a(short[] sArr, int i10, int i11) {
        b(i11);
        int i12 = this.f18069b;
        System.arraycopy(sArr, i10 * i12, this.f18077j, this.f18085r * i12, i12 * i11);
        this.f18085r += i11;
    }

    public final void b(short[] sArr, int i10, int i11) {
        int i12 = this.f18072e / i11;
        int i13 = this.f18069b;
        int i14 = i11 * i13;
        int i15 = i10 * i13;
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                i17 += sArr[(i16 * i14) + i15 + i18];
            }
            this.f18073f[i16] = (short) (i17 / i14);
        }
    }

    public final int a(short[] sArr, int i10, int i11, int i12) {
        int i13 = i10 * this.f18069b;
        int i14 = 1;
        int i15 = 255;
        int i16 = 0;
        int i17 = 0;
        while (i11 <= i12) {
            int i18 = 0;
            for (int i19 = 0; i19 < i11; i19++) {
                short s10 = sArr[i13 + i19];
                short s11 = sArr[i13 + i11 + i19];
                i18 += s10 >= s11 ? s10 - s11 : s11 - s10;
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
        this.f18090w = i14 / i16;
        this.f18091x = i17 / i15;
        return i16;
    }

    public final void a() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = this.f18085r;
        float f10 = this.f18082o / this.f18083p;
        double d10 = f10;
        int i18 = 1;
        if (d10 <= 1.00001d && d10 >= 0.99999d) {
            a(this.f18075h, 0, this.f18084q);
            this.f18084q = 0;
        } else {
            int i19 = this.f18084q;
            if (i19 >= this.f18072e) {
                int i20 = 0;
                while (true) {
                    int i21 = this.f18087t;
                    if (i21 > 0) {
                        int min = Math.min(this.f18072e, i21);
                        a(this.f18075h, i20, min);
                        this.f18087t -= min;
                        i20 += min;
                    } else {
                        short[] sArr = this.f18075h;
                        int i22 = this.f18068a;
                        int i23 = i22 > 4000 ? i22 / TTAdSdk.INIT_LOCAL_FAIL_CODE : 1;
                        if (this.f18069b == i18 && i23 == i18) {
                            i10 = a(sArr, i20, this.f18070c, this.f18071d);
                        } else {
                            b(sArr, i20, i23);
                            int a10 = a(this.f18073f, 0, this.f18070c / i23, this.f18071d / i23);
                            if (i23 != i18) {
                                int i24 = a10 * i23;
                                int i25 = i23 * 4;
                                int i26 = i24 - i25;
                                int i27 = i24 + i25;
                                int i28 = this.f18070c;
                                if (i26 < i28) {
                                    i26 = i28;
                                }
                                int i29 = this.f18071d;
                                if (i27 > i29) {
                                    i27 = i29;
                                }
                                if (this.f18069b == i18) {
                                    i10 = a(sArr, i20, i26, i27);
                                } else {
                                    b(sArr, i20, i18);
                                    i10 = a(this.f18073f, 0, i26, i27);
                                }
                            } else {
                                i10 = a10;
                            }
                        }
                        int i30 = this.f18090w;
                        int i31 = i30 != 0 && this.f18088u != 0 && this.f18091x <= i30 * 3 && i30 * 2 > this.f18089v * 3 ? this.f18088u : i10;
                        this.f18089v = i30;
                        this.f18088u = i10;
                        if (d10 > 1.0d) {
                            short[] sArr2 = this.f18075h;
                            if (f10 >= 2.0f) {
                                i12 = (int) (i31 / (f10 - 1.0f));
                            } else {
                                this.f18087t = (int) ((i31 * (2.0f - f10)) / (f10 - 1.0f));
                                i12 = i31;
                            }
                            b(i12);
                            int i32 = i12;
                            a(i12, this.f18069b, this.f18077j, this.f18085r, sArr2, i20, sArr2, i20 + i31);
                            this.f18085r += i32;
                            i20 += i31 + i32;
                        } else {
                            int i33 = i31;
                            short[] sArr3 = this.f18075h;
                            if (f10 < 0.5f) {
                                i11 = (int) ((i33 * f10) / (1.0f - f10));
                            } else {
                                this.f18087t = (int) ((i33 * ((2.0f * f10) - 1.0f)) / (1.0f - f10));
                                i11 = i33;
                            }
                            int i34 = i33 + i11;
                            b(i34);
                            int i35 = this.f18069b;
                            System.arraycopy(sArr3, i20 * i35, this.f18077j, this.f18085r * i35, i35 * i33);
                            a(i11, this.f18069b, this.f18077j, this.f18085r + i33, sArr3, i33 + i20, sArr3, i20);
                            this.f18085r += i34;
                            i20 += i11;
                        }
                    }
                    if (this.f18072e + i20 > i19) {
                        break;
                    }
                    i18 = 1;
                }
                int i36 = this.f18084q - i20;
                short[] sArr4 = this.f18075h;
                int i37 = this.f18069b;
                System.arraycopy(sArr4, i20 * i37, sArr4, 0, i37 * i36);
                this.f18084q = i36;
            }
        }
        float f11 = this.f18083p;
        if (f11 == 1.0f || this.f18085r == i17) {
            return;
        }
        int i38 = this.f18068a;
        int i39 = (int) (i38 / f11);
        while (true) {
            if (i39 <= 16384 && i38 <= 16384) {
                break;
            }
            i39 /= 2;
            i38 /= 2;
        }
        int i40 = this.f18085r - i17;
        int i41 = this.f18086s + i40;
        int i42 = this.f18078k;
        if (i41 > i42) {
            int i43 = i42 + (i42 / 2) + i40;
            this.f18078k = i43;
            this.f18079l = Arrays.copyOf(this.f18079l, i43 * this.f18069b);
        }
        short[] sArr5 = this.f18077j;
        int i44 = this.f18069b;
        System.arraycopy(sArr5, i17 * i44, this.f18079l, this.f18086s * i44, i44 * i40);
        this.f18085r = i17;
        this.f18086s += i40;
        int i45 = 0;
        while (true) {
            i13 = this.f18086s;
            i14 = i13 - 1;
            if (i45 >= i14) {
                break;
            }
            while (true) {
                i15 = this.f18080m + 1;
                int i46 = i15 * i39;
                i16 = this.f18081n;
                if (i46 <= i16 * i38) {
                    break;
                }
                b(1);
                int i47 = 0;
                while (true) {
                    int i48 = this.f18069b;
                    if (i47 < i48) {
                        short[] sArr6 = this.f18079l;
                        int i49 = (i45 * i48) + i47;
                        short s10 = sArr6[i49];
                        short s11 = sArr6[i49 + i48];
                        int i50 = this.f18080m;
                        int i51 = i50 * i39;
                        int i52 = (i50 + 1) * i39;
                        int i53 = i52 - (this.f18081n * i38);
                        int i54 = i52 - i51;
                        this.f18077j[(this.f18085r * i48) + i47] = (short) (((s10 * i53) + ((i54 - i53) * s11)) / i54);
                        i47++;
                    }
                }
                this.f18081n++;
                this.f18085r++;
            }
            this.f18080m = i15;
            if (i15 == i38) {
                this.f18080m = 0;
                com.fyber.inneractive.sdk.player.exoplayer2.util.a.b(i16 == i39);
                this.f18081n = 0;
            }
            i45++;
        }
        if (i14 == 0) {
            return;
        }
        short[] sArr7 = this.f18079l;
        int i55 = this.f18069b;
        System.arraycopy(sArr7, i14 * i55, sArr7, 0, (i13 - i14) * i55);
        this.f18086s -= i14;
    }

    public static void a(int i10, int i11, short[] sArr, int i12, short[] sArr2, int i13, short[] sArr3, int i14) {
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
}
