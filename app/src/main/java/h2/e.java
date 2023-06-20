package h2;

import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import h2.c;
import java.io.EOFException;
import java.io.IOException;
import java.util.Objects;
import mf.f;
import mf.h;
import mf.i;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: JsonUtf8Reader.java */
/* loaded from: classes.dex */
public final class e extends c {

    /* renamed from: n  reason: collision with root package name */
    private static final i f31076n = i.j("'\\");

    /* renamed from: o  reason: collision with root package name */
    private static final i f31077o = i.j("\"\\");

    /* renamed from: p  reason: collision with root package name */
    private static final i f31078p = i.j("{}[]:, \n\t\r\f/\\;#=");

    /* renamed from: q  reason: collision with root package name */
    private static final i f31079q = i.j("\n\r");

    /* renamed from: r  reason: collision with root package name */
    private static final i f31080r = i.j("*/");

    /* renamed from: h  reason: collision with root package name */
    private final h f31081h;

    /* renamed from: i  reason: collision with root package name */
    private final f f31082i;

    /* renamed from: j  reason: collision with root package name */
    private int f31083j = 0;

    /* renamed from: k  reason: collision with root package name */
    private long f31084k;

    /* renamed from: l  reason: collision with root package name */
    private int f31085l;

    /* renamed from: m  reason: collision with root package name */
    private String f31086m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(h hVar) {
        Objects.requireNonNull(hVar, "source == null");
        this.f31081h = hVar;
        this.f31082i = hVar.p();
        O(6);
    }

    private String C0() throws IOException {
        long P = this.f31081h.P(f31078p);
        return P != -1 ? this.f31082i.s0(P) : this.f31082i.r0();
    }

    private int E0() throws IOException {
        int i10;
        String str;
        String str2;
        byte A = this.f31082i.A(0L);
        if (A == 116 || A == 84) {
            i10 = 5;
            str = InneractiveMediationDefs.SHOW_HOUSE_AD_YES;
            str2 = "TRUE";
        } else if (A == 102 || A == 70) {
            i10 = 6;
            str = "false";
            str2 = "FALSE";
        } else if (A != 110 && A != 78) {
            return 0;
        } else {
            i10 = 7;
            str = "null";
            str2 = "NULL";
        }
        int length = str.length();
        int i11 = 1;
        while (i11 < length) {
            int i12 = i11 + 1;
            if (!this.f31081h.W(i12)) {
                return 0;
            }
            byte A2 = this.f31082i.A(i11);
            if (A2 != str.charAt(i11) && A2 != str2.charAt(i11)) {
                return 0;
            }
            i11 = i12;
        }
        if (this.f31081h.W(length + 1) && r0(this.f31082i.A(length))) {
            return 0;
        }
        this.f31082i.O0(length);
        this.f31083j = i10;
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0087, code lost:
        if (r0(r11) != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0089, code lost:
        if (r6 != 2) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008b, code lost:
        if (r7 == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0091, code lost:
        if (r8 != Long.MIN_VALUE) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0093, code lost:
        if (r10 == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0097, code lost:
        if (r8 != 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0099, code lost:
        if (r10 != false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x009b, code lost:
        if (r10 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x009e, code lost:
        r8 = -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x009f, code lost:
        r16.f31084k = r8;
        r16.f31082i.O0(r5);
        r16.f31083j = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ab, code lost:
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ac, code lost:
        if (r6 == 2) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00af, code lost:
        if (r6 == 4) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00b2, code lost:
        if (r6 != 7) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00b5, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00b7, code lost:
        r16.f31085l = r5;
        r16.f31083j = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00bd, code lost:
        return 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00be, code lost:
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int H0() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.e.H0():int");
    }

    private char K0() throws IOException {
        int i10;
        int i11;
        if (this.f31081h.W(1L)) {
            byte readByte = this.f31082i.readByte();
            if (readByte == 10 || readByte == 34 || readByte == 39 || readByte == 47 || readByte == 92) {
                return (char) readByte;
            }
            if (readByte != 98) {
                if (readByte != 102) {
                    if (readByte != 110) {
                        if (readByte != 114) {
                            if (readByte != 116) {
                                if (readByte != 117) {
                                    if (this.f31061e) {
                                        return (char) readByte;
                                    }
                                    throw g0("Invalid escape sequence: \\" + ((char) readByte));
                                } else if (this.f31081h.W(4L)) {
                                    char c10 = 0;
                                    for (int i12 = 0; i12 < 4; i12++) {
                                        byte A = this.f31082i.A(i12);
                                        char c11 = (char) (c10 << 4);
                                        if (A < 48 || A > 57) {
                                            if (A >= 97 && A <= 102) {
                                                i10 = A - 97;
                                            } else if (A < 65 || A > 70) {
                                                throw g0("\\u" + this.f31082i.s0(4L));
                                            } else {
                                                i10 = A - 65;
                                            }
                                            i11 = i10 + 10;
                                        } else {
                                            i11 = A - 48;
                                        }
                                        c10 = (char) (c11 + i11);
                                    }
                                    this.f31082i.O0(4L);
                                    return c10;
                                } else {
                                    throw new EOFException("Unterminated escape sequence at path " + getPath());
                                }
                            }
                            return '\t';
                        }
                        return '\r';
                    }
                    return '\n';
                }
                return '\f';
            }
            return '\b';
        }
        throw g0("Unterminated escape sequence");
    }

    private void N0(i iVar) throws IOException {
        while (true) {
            long P = this.f31081h.P(iVar);
            if (P != -1) {
                if (this.f31082i.A(P) == 92) {
                    this.f31082i.O0(P + 1);
                    K0();
                } else {
                    this.f31082i.O0(P + 1);
                    return;
                }
            } else {
                throw g0("Unterminated string");
            }
        }
    }

    private boolean Q0() throws IOException {
        h hVar = this.f31081h;
        i iVar = f31080r;
        long f02 = hVar.f0(iVar);
        boolean z10 = f02 != -1;
        f fVar = this.f31082i;
        fVar.O0(z10 ? f02 + iVar.A() : fVar.C0());
        return z10;
    }

    private void T0() throws IOException {
        long P = this.f31081h.P(f31079q);
        f fVar = this.f31082i;
        fVar.O0(P != -1 ? P + 1 : fVar.C0());
    }

    private void U0() throws IOException {
        long P = this.f31081h.P(f31078p);
        f fVar = this.f31082i;
        if (P == -1) {
            P = fVar.C0();
        }
        fVar.O0(P);
    }

    private void h0() throws IOException {
        if (!this.f31061e) {
            throw g0("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private int m0() throws IOException {
        int[] iArr = this.f31058b;
        int i10 = this.f31057a;
        int i11 = iArr[i10 - 1];
        if (i11 == 1) {
            iArr[i10 - 1] = 2;
        } else if (i11 == 2) {
            int s02 = s0(true);
            this.f31082i.readByte();
            if (s02 != 44) {
                if (s02 != 59) {
                    if (s02 == 93) {
                        this.f31083j = 4;
                        return 4;
                    }
                    throw g0("Unterminated array");
                }
                h0();
            }
        } else if (i11 == 3 || i11 == 5) {
            iArr[i10 - 1] = 4;
            if (i11 == 5) {
                int s03 = s0(true);
                this.f31082i.readByte();
                if (s03 != 44) {
                    if (s03 != 59) {
                        if (s03 == 125) {
                            this.f31083j = 2;
                            return 2;
                        }
                        throw g0("Unterminated object");
                    }
                    h0();
                }
            }
            int s04 = s0(true);
            if (s04 == 34) {
                this.f31082i.readByte();
                this.f31083j = 13;
                return 13;
            } else if (s04 == 39) {
                this.f31082i.readByte();
                h0();
                this.f31083j = 12;
                return 12;
            } else if (s04 != 125) {
                h0();
                if (r0((char) s04)) {
                    this.f31083j = 14;
                    return 14;
                }
                throw g0("Expected name");
            } else if (i11 != 5) {
                this.f31082i.readByte();
                this.f31083j = 2;
                return 2;
            } else {
                throw g0("Expected name");
            }
        } else if (i11 == 4) {
            iArr[i10 - 1] = 5;
            int s05 = s0(true);
            this.f31082i.readByte();
            if (s05 != 58) {
                if (s05 == 61) {
                    h0();
                    if (this.f31081h.W(1L) && this.f31082i.A(0L) == 62) {
                        this.f31082i.readByte();
                    }
                } else {
                    throw g0("Expected ':'");
                }
            }
        } else if (i11 == 6) {
            iArr[i10 - 1] = 7;
        } else if (i11 == 7) {
            if (s0(false) == -1) {
                this.f31083j = 18;
                return 18;
            }
            h0();
        } else if (i11 == 8) {
            throw new IllegalStateException("JsonReader is closed");
        }
        int s06 = s0(true);
        if (s06 == 34) {
            this.f31082i.readByte();
            this.f31083j = 9;
            return 9;
        } else if (s06 == 39) {
            h0();
            this.f31082i.readByte();
            this.f31083j = 8;
            return 8;
        } else {
            if (s06 != 44 && s06 != 59) {
                if (s06 == 91) {
                    this.f31082i.readByte();
                    this.f31083j = 3;
                    return 3;
                } else if (s06 != 93) {
                    if (s06 != 123) {
                        int E0 = E0();
                        if (E0 != 0) {
                            return E0;
                        }
                        int H0 = H0();
                        if (H0 != 0) {
                            return H0;
                        }
                        if (r0(this.f31082i.A(0L))) {
                            h0();
                            this.f31083j = 10;
                            return 10;
                        }
                        throw g0("Expected value");
                    }
                    this.f31082i.readByte();
                    this.f31083j = 1;
                    return 1;
                } else if (i11 == 1) {
                    this.f31082i.readByte();
                    this.f31083j = 4;
                    return 4;
                }
            }
            if (i11 != 1 && i11 != 2) {
                throw g0("Unexpected value");
            }
            h0();
            this.f31083j = 7;
            return 7;
        }
    }

    private int q0(String str, c.a aVar) {
        int length = aVar.f31063a.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (str.equals(aVar.f31063a[i10])) {
                this.f31083j = 0;
                this.f31059c[this.f31057a - 1] = str;
                return i10;
            }
        }
        return -1;
    }

    private boolean r0(int i10) throws IOException {
        if (i10 == 9 || i10 == 10 || i10 == 12 || i10 == 13 || i10 == 32) {
            return false;
        }
        if (i10 != 35) {
            if (i10 == 44) {
                return false;
            }
            if (i10 != 47 && i10 != 61) {
                if (i10 == 123 || i10 == 125 || i10 == 58) {
                    return false;
                }
                if (i10 != 59) {
                    switch (i10) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        h0();
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0025, code lost:
        r6.f31082i.O0(r3 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
        if (r1 != 47) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
        if (r6.f31081h.W(2) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003b, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
        h0();
        r3 = r6.f31082i.A(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
        if (r3 == 42) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
        if (r3 == 47) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004d, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004e, code lost:
        r6.f31082i.readByte();
        r6.f31082i.readByte();
        T0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
        r6.f31082i.readByte();
        r6.f31082i.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006a, code lost:
        if (Q0() == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0073, code lost:
        throw g0("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0076, code lost:
        if (r1 != 35) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0078, code lost:
        h0();
        T0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007f, code lost:
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int s0(boolean r7) throws java.io.IOException {
        /*
            r6 = this;
            r0 = 0
        L1:
            r1 = 0
        L2:
            mf.h r2 = r6.f31081h
            int r3 = r1 + 1
            long r4 = (long) r3
            boolean r2 = r2.W(r4)
            if (r2 == 0) goto L82
            mf.f r2 = r6.f31082i
            long r4 = (long) r1
            byte r1 = r2.A(r4)
            r2 = 10
            if (r1 == r2) goto L80
            r2 = 32
            if (r1 == r2) goto L80
            r2 = 13
            if (r1 == r2) goto L80
            r2 = 9
            if (r1 != r2) goto L25
            goto L80
        L25:
            mf.f r2 = r6.f31082i
            int r3 = r3 + (-1)
            long r3 = (long) r3
            r2.O0(r3)
            r2 = 47
            if (r1 != r2) goto L74
            mf.h r3 = r6.f31081h
            r4 = 2
            boolean r3 = r3.W(r4)
            if (r3 != 0) goto L3c
            return r1
        L3c:
            r6.h0()
            mf.f r3 = r6.f31082i
            r4 = 1
            byte r3 = r3.A(r4)
            r4 = 42
            if (r3 == r4) goto L5c
            if (r3 == r2) goto L4e
            return r1
        L4e:
            mf.f r1 = r6.f31082i
            r1.readByte()
            mf.f r1 = r6.f31082i
            r1.readByte()
            r6.T0()
            goto L1
        L5c:
            mf.f r1 = r6.f31082i
            r1.readByte()
            mf.f r1 = r6.f31082i
            r1.readByte()
            boolean r1 = r6.Q0()
            if (r1 == 0) goto L6d
            goto L1
        L6d:
            java.lang.String r7 = "Unterminated comment"
            h2.b r7 = r6.g0(r7)
            throw r7
        L74:
            r2 = 35
            if (r1 != r2) goto L7f
            r6.h0()
            r6.T0()
            goto L1
        L7f:
            return r1
        L80:
            r1 = r3
            goto L2
        L82:
            if (r7 != 0) goto L86
            r7 = -1
            return r7
        L86:
            java.io.EOFException r7 = new java.io.EOFException
            java.lang.String r0 = "End of input"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.e.s0(boolean):int");
    }

    private String z0(i iVar) throws IOException {
        StringBuilder sb2 = null;
        while (true) {
            long P = this.f31081h.P(iVar);
            if (P != -1) {
                if (this.f31082i.A(P) != 92) {
                    if (sb2 == null) {
                        String s02 = this.f31082i.s0(P);
                        this.f31082i.readByte();
                        return s02;
                    }
                    sb2.append(this.f31082i.s0(P));
                    this.f31082i.readByte();
                    return sb2.toString();
                }
                if (sb2 == null) {
                    sb2 = new StringBuilder();
                }
                sb2.append(this.f31082i.s0(P));
                this.f31082i.readByte();
                sb2.append(K0());
            } else {
                throw g0("Unterminated string");
            }
        }
    }

    @Override // h2.c
    public String A() throws IOException {
        String s02;
        int i10 = this.f31083j;
        if (i10 == 0) {
            i10 = m0();
        }
        if (i10 == 10) {
            s02 = C0();
        } else if (i10 == 9) {
            s02 = z0(f31077o);
        } else if (i10 == 8) {
            s02 = z0(f31076n);
        } else if (i10 == 11) {
            s02 = this.f31086m;
            this.f31086m = null;
        } else if (i10 == 16) {
            s02 = Long.toString(this.f31084k);
        } else if (i10 == 17) {
            s02 = this.f31082i.s0(this.f31085l);
        } else {
            throw new a("Expected a string but was " + L() + " at path " + getPath());
        }
        this.f31083j = 0;
        int[] iArr = this.f31060d;
        int i11 = this.f31057a - 1;
        iArr[i11] = iArr[i11] + 1;
        return s02;
    }

    @Override // h2.c
    public c.b L() throws IOException {
        int i10 = this.f31083j;
        if (i10 == 0) {
            i10 = m0();
        }
        switch (i10) {
            case 1:
                return c.b.BEGIN_OBJECT;
            case 2:
                return c.b.END_OBJECT;
            case 3:
                return c.b.BEGIN_ARRAY;
            case 4:
                return c.b.END_ARRAY;
            case 5:
            case 6:
                return c.b.BOOLEAN;
            case 7:
                return c.b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return c.b.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return c.b.NAME;
            case 16:
            case 17:
                return c.b.NUMBER;
            case 18:
                return c.b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    @Override // h2.c
    public int T(c.a aVar) throws IOException {
        int i10 = this.f31083j;
        if (i10 == 0) {
            i10 = m0();
        }
        if (i10 < 12 || i10 > 15) {
            return -1;
        }
        if (i10 == 15) {
            return q0(this.f31086m, aVar);
        }
        int X = this.f31081h.X(aVar.f31064b);
        if (X != -1) {
            this.f31083j = 0;
            this.f31059c[this.f31057a - 1] = aVar.f31063a[X];
            return X;
        }
        String str = this.f31059c[this.f31057a - 1];
        String z10 = z();
        int q02 = q0(z10, aVar);
        if (q02 == -1) {
            this.f31083j = 15;
            this.f31086m = z10;
            this.f31059c[this.f31057a - 1] = str;
        }
        return q02;
    }

    @Override // h2.c
    public void U() throws IOException {
        if (!this.f31062f) {
            int i10 = this.f31083j;
            if (i10 == 0) {
                i10 = m0();
            }
            if (i10 == 14) {
                U0();
            } else if (i10 == 13) {
                N0(f31077o);
            } else if (i10 == 12) {
                N0(f31076n);
            } else if (i10 != 15) {
                throw new a("Expected a name but was " + L() + " at path " + getPath());
            }
            this.f31083j = 0;
            this.f31059c[this.f31057a - 1] = "null";
            return;
        }
        throw new a("Cannot skip unexpected " + L() + " at " + getPath());
    }

    @Override // h2.c
    public void Z() throws IOException {
        if (!this.f31062f) {
            int i10 = 0;
            do {
                int i11 = this.f31083j;
                if (i11 == 0) {
                    i11 = m0();
                }
                if (i11 == 3) {
                    O(1);
                } else if (i11 == 1) {
                    O(3);
                } else {
                    if (i11 == 4) {
                        i10--;
                        if (i10 >= 0) {
                            this.f31057a--;
                        } else {
                            throw new a("Expected a value but was " + L() + " at path " + getPath());
                        }
                    } else if (i11 == 2) {
                        i10--;
                        if (i10 >= 0) {
                            this.f31057a--;
                        } else {
                            throw new a("Expected a value but was " + L() + " at path " + getPath());
                        }
                    } else if (i11 == 14 || i11 == 10) {
                        U0();
                    } else if (i11 == 9 || i11 == 13) {
                        N0(f31077o);
                    } else if (i11 == 8 || i11 == 12) {
                        N0(f31076n);
                    } else if (i11 == 17) {
                        this.f31082i.O0(this.f31085l);
                    } else if (i11 == 18) {
                        throw new a("Expected a value but was " + L() + " at path " + getPath());
                    }
                    this.f31083j = 0;
                }
                i10++;
                this.f31083j = 0;
            } while (i10 != 0);
            int[] iArr = this.f31060d;
            int i12 = this.f31057a;
            int i13 = i12 - 1;
            iArr[i13] = iArr[i13] + 1;
            this.f31059c[i12 - 1] = "null";
            return;
        }
        throw new a("Cannot skip unexpected " + L() + " at " + getPath());
    }

    @Override // h2.c
    public void b() throws IOException {
        int i10 = this.f31083j;
        if (i10 == 0) {
            i10 = m0();
        }
        if (i10 == 3) {
            O(1);
            this.f31060d[this.f31057a - 1] = 0;
            this.f31083j = 0;
            return;
        }
        throw new a("Expected BEGIN_ARRAY but was " + L() + " at path " + getPath());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f31083j = 0;
        this.f31058b[0] = 8;
        this.f31057a = 1;
        this.f31082i.b();
        this.f31081h.close();
    }

    @Override // h2.c
    public void d() throws IOException {
        int i10 = this.f31083j;
        if (i10 == 0) {
            i10 = m0();
        }
        if (i10 == 1) {
            O(3);
            this.f31083j = 0;
            return;
        }
        throw new a("Expected BEGIN_OBJECT but was " + L() + " at path " + getPath());
    }

    @Override // h2.c
    public void e() throws IOException {
        int i10 = this.f31083j;
        if (i10 == 0) {
            i10 = m0();
        }
        if (i10 == 4) {
            int i11 = this.f31057a - 1;
            this.f31057a = i11;
            int[] iArr = this.f31060d;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
            this.f31083j = 0;
            return;
        }
        throw new a("Expected END_ARRAY but was " + L() + " at path " + getPath());
    }

    @Override // h2.c
    public void h() throws IOException {
        int i10 = this.f31083j;
        if (i10 == 0) {
            i10 = m0();
        }
        if (i10 == 2) {
            int i11 = this.f31057a - 1;
            this.f31057a = i11;
            this.f31059c[i11] = null;
            int[] iArr = this.f31060d;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
            this.f31083j = 0;
            return;
        }
        throw new a("Expected END_OBJECT but was " + L() + " at path " + getPath());
    }

    @Override // h2.c
    public boolean l() throws IOException {
        int i10 = this.f31083j;
        if (i10 == 0) {
            i10 = m0();
        }
        return (i10 == 2 || i10 == 4 || i10 == 18) ? false : true;
    }

    @Override // h2.c
    public boolean q() throws IOException {
        int i10 = this.f31083j;
        if (i10 == 0) {
            i10 = m0();
        }
        if (i10 == 5) {
            this.f31083j = 0;
            int[] iArr = this.f31060d;
            int i11 = this.f31057a - 1;
            iArr[i11] = iArr[i11] + 1;
            return true;
        } else if (i10 == 6) {
            this.f31083j = 0;
            int[] iArr2 = this.f31060d;
            int i12 = this.f31057a - 1;
            iArr2[i12] = iArr2[i12] + 1;
            return false;
        } else {
            throw new a("Expected a boolean but was " + L() + " at path " + getPath());
        }
    }

    public String toString() {
        return "JsonReader(" + this.f31081h + ")";
    }

    @Override // h2.c
    public double w() throws IOException {
        int i10 = this.f31083j;
        if (i10 == 0) {
            i10 = m0();
        }
        if (i10 == 16) {
            this.f31083j = 0;
            int[] iArr = this.f31060d;
            int i11 = this.f31057a - 1;
            iArr[i11] = iArr[i11] + 1;
            return this.f31084k;
        }
        if (i10 == 17) {
            this.f31086m = this.f31082i.s0(this.f31085l);
        } else if (i10 == 9) {
            this.f31086m = z0(f31077o);
        } else if (i10 == 8) {
            this.f31086m = z0(f31076n);
        } else if (i10 == 10) {
            this.f31086m = C0();
        } else if (i10 != 11) {
            throw new a("Expected a double but was " + L() + " at path " + getPath());
        }
        this.f31083j = 11;
        try {
            double parseDouble = Double.parseDouble(this.f31086m);
            if (!this.f31061e && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
                throw new b("JSON forbids NaN and infinities: " + parseDouble + " at path " + getPath());
            }
            this.f31086m = null;
            this.f31083j = 0;
            int[] iArr2 = this.f31060d;
            int i12 = this.f31057a - 1;
            iArr2[i12] = iArr2[i12] + 1;
            return parseDouble;
        } catch (NumberFormatException unused) {
            throw new a("Expected a double but was " + this.f31086m + " at path " + getPath());
        }
    }

    @Override // h2.c
    public int y() throws IOException {
        String z02;
        int i10 = this.f31083j;
        if (i10 == 0) {
            i10 = m0();
        }
        if (i10 == 16) {
            long j10 = this.f31084k;
            int i11 = (int) j10;
            if (j10 == i11) {
                this.f31083j = 0;
                int[] iArr = this.f31060d;
                int i12 = this.f31057a - 1;
                iArr[i12] = iArr[i12] + 1;
                return i11;
            }
            throw new a("Expected an int but was " + this.f31084k + " at path " + getPath());
        }
        if (i10 == 17) {
            this.f31086m = this.f31082i.s0(this.f31085l);
        } else if (i10 == 9 || i10 == 8) {
            if (i10 == 9) {
                z02 = z0(f31077o);
            } else {
                z02 = z0(f31076n);
            }
            this.f31086m = z02;
            try {
                int parseInt = Integer.parseInt(z02);
                this.f31083j = 0;
                int[] iArr2 = this.f31060d;
                int i13 = this.f31057a - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (i10 != 11) {
            throw new a("Expected an int but was " + L() + " at path " + getPath());
        }
        this.f31083j = 11;
        try {
            double parseDouble = Double.parseDouble(this.f31086m);
            int i14 = (int) parseDouble;
            if (i14 == parseDouble) {
                this.f31086m = null;
                this.f31083j = 0;
                int[] iArr3 = this.f31060d;
                int i15 = this.f31057a - 1;
                iArr3[i15] = iArr3[i15] + 1;
                return i14;
            }
            throw new a("Expected an int but was " + this.f31086m + " at path " + getPath());
        } catch (NumberFormatException unused2) {
            throw new a("Expected an int but was " + this.f31086m + " at path " + getPath());
        }
    }

    @Override // h2.c
    public String z() throws IOException {
        String str;
        int i10 = this.f31083j;
        if (i10 == 0) {
            i10 = m0();
        }
        if (i10 == 14) {
            str = C0();
        } else if (i10 == 13) {
            str = z0(f31077o);
        } else if (i10 == 12) {
            str = z0(f31076n);
        } else if (i10 == 15) {
            str = this.f31086m;
        } else {
            throw new a("Expected a name but was " + L() + " at path " + getPath());
        }
        this.f31083j = 0;
        this.f31059c[this.f31057a - 1] = str;
        return str;
    }
}
