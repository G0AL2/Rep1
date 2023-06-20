package com.fyber.inneractive.sdk.protobuf;

/* loaded from: classes2.dex */
public final class d1 implements o0 {

    /* renamed from: a  reason: collision with root package name */
    public final q0 f19853a;

    /* renamed from: b  reason: collision with root package name */
    public final String f19854b;

    /* renamed from: c  reason: collision with root package name */
    public final Object[] f19855c;

    /* renamed from: d  reason: collision with root package name */
    public final int f19856d;

    public d1(q0 q0Var, String str, Object[] objArr) {
        char charAt;
        this.f19853a = q0Var;
        this.f19854b = str;
        this.f19855c = objArr;
        int i10 = 1;
        try {
            charAt = str.charAt(0);
        } catch (StringIndexOutOfBoundsException unused) {
            char[] charArray = str.toCharArray();
            String str2 = new String(charArray);
            try {
                try {
                    charAt = str2.charAt(0);
                    str = str2;
                } catch (ArrayIndexOutOfBoundsException e10) {
                    e = e10;
                    throw new IllegalStateException(String.format("Failed parsing '%s' with charArray.length of %d", str2, Integer.valueOf(charArray.length)), e);
                } catch (StringIndexOutOfBoundsException e11) {
                    e = e11;
                    throw new IllegalStateException(String.format("Failed parsing '%s' with charArray.length of %d", str2, Integer.valueOf(charArray.length)), e);
                }
            } catch (StringIndexOutOfBoundsException unused2) {
                char[] cArr = new char[str2.length()];
                str2.getChars(0, str2.length(), cArr, 0);
                String str3 = new String(cArr);
                try {
                    charAt = str3.charAt(0);
                    str = str3;
                } catch (ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException e12) {
                    e = e12;
                    str2 = str3;
                    throw new IllegalStateException(String.format("Failed parsing '%s' with charArray.length of %d", str2, Integer.valueOf(charArray.length)), e);
                }
            }
        }
        if (charAt < 55296) {
            this.f19856d = charAt;
            return;
        }
        int i11 = charAt & 8191;
        int i12 = 13;
        while (true) {
            int i13 = i10 + 1;
            char charAt2 = str.charAt(i10);
            if (charAt2 < 55296) {
                this.f19856d = (charAt2 << i12) | i11;
                return;
            }
            i11 |= (charAt2 & 8191) << i12;
            i12 += 13;
            i10 = i13;
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.o0
    public a1 a() {
        return (this.f19856d & 1) == 1 ? a1.PROTO2 : a1.PROTO3;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.o0
    public q0 b() {
        return this.f19853a;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.o0
    public boolean c() {
        return (this.f19856d & 2) == 2;
    }
}
