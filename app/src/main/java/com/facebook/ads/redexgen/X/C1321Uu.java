package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Uu  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1321Uu implements InterfaceC0975He {
    public static byte[] A07;
    public static String[] A08 = {"bSKnstrcEyUtH2EUzSuh7p", "TJp7broMG9ALkddxCeG8bg", "OUGN6fd13DTUK57USEtQiA6N8BMR4vG7", "MPCQ8AeafYWdEx3u0S1dfC5VpPwXU5er", "I2tJ7ud2NszgocKkHkmClXbQ6vlHE0Sp", "WRhnMtRu3VoUyGpCORxDhLZcb6GbN7Pt", "ionJv1BxfCrQS8AxzLJ8Tcnsr6gm7Nx1", "YblFDiTYESfr8ZIRtB8BAyjauKLHc0qm"};
    public long A00;
    public AssetFileDescriptor A01;
    public Uri A02;
    public InputStream A03;
    public boolean A04;
    public final Resources A05;
    @Nullable
    public final I0<? super C1321Uu> A06;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 108);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{70, 113, 103, 123, 97, 102, 119, 113, 52, 125, 112, 113, 122, 96, 125, 114, 125, 113, 102, 52, 121, 97, 103, 96, 52, 118, 113, 52, 117, 122, 52, 125, 122, 96, 113, 115, 113, 102, 58, 7, 0, 27, 114, 63, 39, 33, 38, 114, 39, 33, 55, 114, 33, 49, 58, 55, 63, 55, 114, 32, 51, 37, 32, 55, 33, 61, 39, 32, 49, 55, 117, 102, 112, 117, 98, 116, 104, 114, 117, 100, 98};
    }

    static {
        A01();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.I0 != com.facebook.ads.internal.exoplayer2.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.upstream.RawResourceDataSource> */
    public C1321Uu(Context context, @Nullable I0<? super C1321Uu> i02) {
        this.A05 = context.getResources();
        this.A06 = i02;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0975He
    public final Uri A7k() {
        return this.A02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x008b, code lost:
        if (r1 != (-1)) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0097, code lost:
        if (r1 != (-1)) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0099, code lost:
        r7.A00 = r8.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009e, code lost:
        r2 = r7.A01.getLength();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a6, code lost:
        if (r2 != (-1)) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a8, code lost:
        r7.A00 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ab, code lost:
        r4 = r2 - r8.A03;
     */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0975He
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long ACw(com.facebook.ads.redexgen.X.C0979Hi r8) throws com.facebook.ads.redexgen.X.C0994Hz {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1321Uu.ACw(com.facebook.ads.redexgen.X.Hi):long");
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0975He
    public final void close() throws C0994Hz {
        this.A02 = null;
        try {
            try {
                if (this.A03 != null) {
                    this.A03.close();
                }
                this.A03 = null;
                try {
                    try {
                        if (this.A01 != null) {
                            this.A01.close();
                        }
                    } finally {
                        this.A01 = null;
                        if (this.A04) {
                            this.A04 = false;
                            I0<? super C1321Uu> i02 = this.A06;
                            if (i02 != null) {
                                i02.ACa(this);
                            }
                        }
                    }
                } catch (IOException e10) {
                    throw new C0994Hz(e10);
                }
            } catch (IOException e11) {
                throw new C0994Hz(e11);
            }
        } catch (Throwable th) {
            this.A03 = null;
            try {
                try {
                    if (this.A01 != null) {
                        this.A01.close();
                    }
                    this.A01 = null;
                    if (this.A04) {
                        this.A04 = false;
                        I0<? super C1321Uu> i03 = this.A06;
                        if (i03 != null) {
                            i03.ACa(this);
                        }
                    }
                    throw th;
                } finally {
                    this.A01 = null;
                    if (this.A04) {
                        this.A04 = false;
                        I0<? super C1321Uu> i04 = this.A06;
                        if (i04 != null) {
                            i04.ACa(this);
                        }
                    }
                }
            } catch (IOException e12) {
                throw new C0994Hz(e12);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0975He
    public final int read(byte[] bArr, int i10, int i11) throws C0994Hz {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.A00;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new C0994Hz(e10);
            }
        }
        int read = this.A03.read(bArr, i10, i11);
        if (read == -1) {
            if (this.A00 == -1) {
                return -1;
            }
            throw new C0994Hz(new EOFException());
        }
        long j11 = this.A00;
        if (j11 != -1) {
            this.A00 = j11 - read;
        }
        I0<? super C1321Uu> i02 = this.A06;
        if (i02 != null) {
            i02.AAG(this, read);
        }
        return read;
    }
}
