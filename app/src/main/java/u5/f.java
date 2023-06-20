package u5;

import java.io.IOException;
import java.io.InputStream;
import y3.k;
import y3.p;

/* compiled from: ProgressiveJpegParser.java */
/* loaded from: classes.dex */
public class f {

    /* renamed from: g  reason: collision with root package name */
    private boolean f37577g;

    /* renamed from: h  reason: collision with root package name */
    private final b4.a f37578h;

    /* renamed from: c  reason: collision with root package name */
    private int f37573c = 0;

    /* renamed from: b  reason: collision with root package name */
    private int f37572b = 0;

    /* renamed from: d  reason: collision with root package name */
    private int f37574d = 0;

    /* renamed from: f  reason: collision with root package name */
    private int f37576f = 0;

    /* renamed from: e  reason: collision with root package name */
    private int f37575e = 0;

    /* renamed from: a  reason: collision with root package name */
    private int f37571a = 0;

    public f(b4.a aVar) {
        this.f37578h = (b4.a) k.g(aVar);
    }

    private boolean a(InputStream inputStream) {
        int read;
        int i10 = this.f37575e;
        while (this.f37571a != 6 && (read = inputStream.read()) != -1) {
            try {
                int i11 = this.f37573c + 1;
                this.f37573c = i11;
                if (this.f37577g) {
                    this.f37571a = 6;
                    this.f37577g = false;
                    return false;
                }
                int i12 = this.f37571a;
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            if (i12 != 3) {
                                if (i12 == 4) {
                                    this.f37571a = 5;
                                } else if (i12 != 5) {
                                    k.i(false);
                                } else {
                                    int i13 = ((this.f37572b << 8) + read) - 2;
                                    g4.d.a(inputStream, i13);
                                    this.f37573c += i13;
                                    this.f37571a = 2;
                                }
                            } else if (read == 255) {
                                this.f37571a = 3;
                            } else if (read == 0) {
                                this.f37571a = 2;
                            } else if (read == 217) {
                                this.f37577g = true;
                                f(i11 - 2);
                                this.f37571a = 2;
                            } else {
                                if (read == 218) {
                                    f(i11 - 2);
                                }
                                if (b(read)) {
                                    this.f37571a = 4;
                                } else {
                                    this.f37571a = 2;
                                }
                            }
                        } else if (read == 255) {
                            this.f37571a = 3;
                        }
                    } else if (read == 216) {
                        this.f37571a = 2;
                    } else {
                        this.f37571a = 6;
                    }
                } else if (read == 255) {
                    this.f37571a = 1;
                } else {
                    this.f37571a = 6;
                }
                this.f37572b = read;
            } catch (IOException e10) {
                p.a(e10);
            }
        }
        return (this.f37571a == 6 || this.f37575e == i10) ? false : true;
    }

    private static boolean b(int i10) {
        if (i10 == 1) {
            return false;
        }
        return ((i10 >= 208 && i10 <= 215) || i10 == 217 || i10 == 216) ? false : true;
    }

    private void f(int i10) {
        int i11 = this.f37574d;
        if (i11 > 0) {
            this.f37576f = i10;
        }
        this.f37574d = i11 + 1;
        this.f37575e = i11;
    }

    public int c() {
        return this.f37576f;
    }

    public int d() {
        return this.f37575e;
    }

    public boolean e() {
        return this.f37577g;
    }

    public boolean g(w5.e eVar) {
        if (this.f37571a != 6 && eVar.U() > this.f37573c) {
            b4.f fVar = new b4.f(eVar.L(), this.f37578h.get(16384), this.f37578h);
            try {
                g4.d.a(fVar, this.f37573c);
                return a(fVar);
            } catch (IOException e10) {
                p.a(e10);
                return false;
            } finally {
                y3.b.b(fVar);
            }
        }
        return false;
    }
}
