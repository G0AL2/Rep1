package com.facebook.ads.redexgen.X;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: assets/audience_network.dex */
public final class IC {
    public static byte[] A08;
    public static String[] A09 = {"XONorMmEkuhCG9piVxKUh1vkXNNJ", "9nfZq9rsOYHCIqBCRPzuDpg7UYzPD2Yl", "Yz44fu3QSKzu2i5DyXETxtSOt38Z3WJk", "HOY3mHCHBdW1ht", "XI2xTZ9JkVa2GEn", "4OCnssyPGh2MUqheTrzmDcc0Epkw2MIq", "4Z9FwJdzaIh4z0baUKFOBcRAp1yx", "rZsSxCWfylE928lHlC5xkXC43RMRLxAb"};
    public C1011Iq A00;
    public boolean A01;
    public final SparseArray<String> A02;
    public final IM A03;
    public final HashMap<String, IB> A04;
    public final Cipher A05;
    public final SecretKeySpec A06;
    public final boolean A07;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 116);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        String[] strArr = A09;
        if (strArr[6].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A09;
        strArr2[7] = "3hiG2MwLP1vY28w2jyIZHTbcKAlMPBPZ";
        strArr2[2] = "9NEv2gVVsGFA2BwX54IQqGQXEg3TAXQS";
        A08 = new byte[]{26, 30, 44, 32, 36, 50, 14, 34, 33, 34, 14, 47, 42, 34, 50, 20, 47, 32, 35, 35, 40, 45, 38, -48, -47, 26, 24, 26, 31, 28, 27, 22, 26, 38, 37, 43, 28, 37, 43, 22, 32, 37, 27, 28, 47, -27, 28, 47, 32};
    }

    static {
        A05();
    }

    public IC(File file, @Nullable byte[] bArr, boolean z10) {
        this.A07 = z10;
        if (bArr != null) {
            IK.A03(bArr.length == 16);
            try {
                this.A05 = A03();
                this.A06 = new SecretKeySpec(bArr, A02(0, 3, 101));
            } catch (NoSuchAlgorithmException | NoSuchPaddingException e10) {
                throw new IllegalStateException(e10);
            }
        } else {
            IK.A04(!z10);
            this.A05 = null;
            this.A06 = null;
        }
        this.A04 = new HashMap<>();
        this.A02 = new SparseArray<>();
        this.A03 = new IM(new File(file, A02(25, 24, 67)));
    }

    public static int A00(SparseArray<String> sparseArray) {
        int keyAt;
        int id2 = sparseArray.size();
        if (id2 == 0) {
            keyAt = 0;
        } else {
            int i10 = id2 - 1;
            String[] strArr = A09;
            if (strArr[7].charAt(12) != strArr[2].charAt(12)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A09;
            strArr2[6] = "GpSMRVwbmVnvoZI5Ggc91zVjP9Ti";
            strArr2[0] = "f9953PfVQawIaiCUJ4cnumBLGdw9";
            keyAt = sparseArray.keyAt(i10) + 1;
        }
        if (keyAt < 0) {
            keyAt = 0;
            while (keyAt < id2 && keyAt == sparseArray.keyAt(keyAt)) {
                keyAt++;
            }
        }
        return keyAt;
    }

    private IB A01(String str) {
        IB ib2 = new IB(A00(this.A02), str);
        A06(ib2);
        this.A01 = true;
        return ib2;
    }

    public static Cipher A03() throws NoSuchPaddingException, NoSuchAlgorithmException {
        int i10 = C1020Iz.A02;
        String A02 = A02(3, 20, 107);
        if (i10 == 18) {
            try {
                return Cipher.getInstance(A02, A02(23, 2, 26));
            } catch (Throwable unused) {
            }
        }
        return Cipher.getInstance(A02);
    }

    private void A04() throws I2 {
        try {
            try {
                OutputStream A04 = this.A03.A04();
                if (this.A00 == null) {
                    this.A00 = new C1011Iq(A04);
                } else {
                    this.A00.A00(A04);
                }
                DataOutputStream dataOutputStream = new DataOutputStream(this.A00);
                dataOutputStream.writeInt(2);
                dataOutputStream.writeInt(this.A07 ? 1 : 0);
                if (this.A07) {
                    byte[] bArr = new byte[16];
                    new Random().nextBytes(bArr);
                    dataOutputStream.write(bArr);
                    try {
                        this.A05.init(1, this.A06, new IvParameterSpec(bArr));
                        dataOutputStream.flush();
                        dataOutputStream = new DataOutputStream(new CipherOutputStream(this.A00, this.A05));
                    } catch (InvalidAlgorithmParameterException | InvalidKeyException e10) {
                        throw new IllegalStateException(e10);
                    }
                }
                dataOutputStream.writeInt(this.A04.size());
                int i10 = 0;
                for (IB ib2 : this.A04.values()) {
                    ib2.A0A(dataOutputStream);
                    int hashCode = ib2.A03(2);
                    i10 += hashCode;
                }
                dataOutputStream.writeInt(i10);
                this.A03.A06(dataOutputStream);
                C1020Iz.A0X(null);
            } catch (IOException e11) {
                throw new I2(e11);
            }
        } catch (Throwable th) {
            C1020Iz.A0X(null);
            throw th;
        }
    }

    private void A06(IB ib2) {
        this.A04.put(ib2.A03, ib2);
        this.A02.put(ib2.A02, ib2.A03);
    }

    private boolean A07() {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(this.A03.A03());
            DataInputStream dataInputStream = new DataInputStream(bufferedInputStream);
            int readInt = dataInputStream.readInt();
            if (readInt < 0 || readInt > 2) {
                C1020Iz.A0X(dataInputStream);
                return false;
            }
            if ((dataInputStream.readInt() & 1) != 0) {
                if (this.A05 == null) {
                    C1020Iz.A0X(dataInputStream);
                    return false;
                }
                byte[] initializationVector = new byte[16];
                dataInputStream.readFully(initializationVector);
                try {
                    this.A05.init(2, this.A06, new IvParameterSpec(initializationVector));
                    dataInputStream = new DataInputStream(new CipherInputStream(bufferedInputStream, this.A05));
                } catch (InvalidAlgorithmParameterException | InvalidKeyException e10) {
                    throw new IllegalStateException(e10);
                }
            } else if (this.A07) {
                this.A01 = true;
            }
            int readInt2 = dataInputStream.readInt();
            int i10 = 0;
            for (int i11 = 0; i11 < readInt2; i11++) {
                IB cachedContent = IB.A00(readInt, dataInputStream);
                A06(cachedContent);
                i10 += cachedContent.A03(readInt);
            }
            int readInt3 = dataInputStream.readInt();
            boolean isEOF = dataInputStream.read() == -1;
            if (readInt3 != i10 || !isEOF) {
                C1020Iz.A0X(dataInputStream);
                return false;
            }
            C1020Iz.A0X(dataInputStream);
            return true;
        } catch (IOException unused) {
            if (0 != 0) {
                C1020Iz.A0X(null);
            }
            return false;
        } catch (Throwable th) {
            if (0 != 0) {
                C1020Iz.A0X(null);
            }
            throw th;
        }
    }

    public final int A08(String str) {
        return A0A(str).A02;
    }

    public final IB A09(String str) {
        return this.A04.get(str);
    }

    public final IB A0A(String str) {
        IB ib2 = this.A04.get(str);
        return ib2 == null ? A01(str) : ib2;
    }

    public final IE A0B(String str) {
        IB A092 = A09(str);
        return A092 != null ? A092.A05() : C1314Un.A04;
    }

    public final String A0C(int i10) {
        return this.A02.get(i10);
    }

    public final Collection<IB> A0D() {
        return this.A04.values();
    }

    public final void A0E() {
        IK.A04(!this.A01);
        if (!A07()) {
            this.A03.A05();
            this.A04.clear();
            this.A02.clear();
        }
    }

    public final void A0F() {
        String[] strArr = new String[this.A04.size()];
        this.A04.keySet().toArray(strArr);
        for (String str : strArr) {
            A0H(str);
        }
    }

    public final void A0G() throws I2 {
        if (!this.A01) {
            return;
        }
        A04();
        this.A01 = false;
    }

    public final void A0H(String str) {
        IB ib2 = this.A04.get(str);
        if (ib2 != null && ib2.A0C() && !ib2.A0D()) {
            this.A04.remove(str);
            this.A02.remove(ib2.A02);
            this.A01 = true;
        }
    }

    public final void A0I(String str, IG ig) {
        if (A0A(str).A0F(ig)) {
            this.A01 = true;
        }
    }
}
