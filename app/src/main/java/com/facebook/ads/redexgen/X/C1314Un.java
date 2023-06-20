package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Un  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1314Un implements IE {
    public static byte[] A02;
    public static String[] A03 = {"", "E0qfI7DZu8nkzGv3MH4nJgqlD44FCDGV", "PylumRpOhcOqV8SE", "Pn3Or3lb8D1PR4hBSIJHER", "QrYBpEt5fxgmrBLneQSlInRulpYQYEG6", "kBYBv8gRMrLmplmIT6dDUsqqwhnWF3zw", "1HLCV5Ojolr5GVwArEzJLOO78iGdJHxw", "UyANx1"};
    public static final C1314Un A04;
    public int A00;
    public final Map<String, byte[]> A01;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A03;
            if (strArr[7].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            A03[3] = "rKK8X5tVBBDKhSudhE31wx";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 62);
            if (A03[2].length() != 16) {
                String[] strArr2 = A03;
                strArr2[7] = "FSEtti";
                strArr2[0] = "";
                i13 += 0;
            } else {
                String[] strArr3 = A03;
                strArr3[5] = "3tkzovd4FYEmOrd3uFeQsH7k2lQqNCGR";
                strArr3[4] = "QPp8yxf18vRmRgJoVMCalcriT9AA2Yst";
                i13++;
            }
        }
    }

    public static void A03() {
        byte[] bArr = {-121, -84, -76, -97, -86, -89, -94, 94, -76, -97, -86, -77, -93, 94, -79, -89, -72, -93, 120, 94, 11, 31, 28, -41, 42, 32, 49, 28, -41, 38, 29, -41, -36, 42, -41, -33, -36, 27, -32, -41, 32, 42, -41, 30, 41, 28, 24, 43, 28, 41, -41, 43, 31, 24, 37, -41, 36, 24, 47, 32, 36, 44, 36, -41, 24, 35, 35, 38, 46, 28, 27, -15, -41, -36, 27, -31, -32, -46, -71, -60};
        if (A03[3].length() != 22) {
            throw new RuntimeException();
        }
        A03[1] = "Wq4xFI36yK0vrvDqIYZkxKx0C2M1IMKh";
        A02 = bArr;
    }

    static {
        A03();
        A04 = new C1314Un(Collections.emptyMap());
    }

    public C1314Un(Map<String, byte[]> map) {
        Map<String, byte[]> metadata = Collections.unmodifiableMap(map);
        this.A01 = metadata;
    }

    public static C1314Un A00(DataInputStream dataInputStream) throws IOException {
        int readInt = dataInputStream.readInt();
        HashMap hashMap = new HashMap();
        for (int i10 = 0; i10 < readInt; i10++) {
            String readUTF = dataInputStream.readUTF();
            int readInt2 = dataInputStream.readInt();
            if (A03[6].charAt(12) != 'G') {
                throw new RuntimeException();
            }
            A03[3] = "zQpUPHnv7TxzcbRfe6tZ6j";
            if (readInt2 < 0 || readInt2 > 10485760) {
                throw new IOException(A01(0, 20, 0) + readInt2);
            }
            byte[] bArr = new byte[readInt2];
            dataInputStream.readFully(bArr);
            hashMap.put(readUTF, bArr);
        }
        return new C1314Un(hashMap);
    }

    public static Map<String, byte[]> A02(Map<String, byte[]> map, IG ig) {
        HashMap hashMap = new HashMap(map);
        A04(hashMap, ig.A04());
        A05(hashMap, ig.A05());
        return hashMap;
    }

    public static void A04(HashMap<String, byte[]> hashMap, List<String> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            hashMap.remove(list.get(i10));
        }
    }

    public static void A05(HashMap<String, byte[]> hashMap, Map<String, Object> map) {
        for (String str : map.keySet()) {
            Object value = map.get(str);
            byte[] A07 = A07(value);
            if (A07.length <= 10485760) {
                hashMap.put(str, A07);
            } else {
                Object value2 = Integer.valueOf(A07.length);
                throw new IllegalArgumentException(String.format(A01(20, 55, 121), str, value2, 10485760));
            }
        }
    }

    private boolean A06(Map<String, byte[]> map) {
        Map<String, byte[]> otherMetadata = this.A01;
        if (otherMetadata.size() != map.size()) {
            return false;
        }
        Map<String, byte[]> otherMetadata2 = this.A01;
        for (Map.Entry<String, byte[]> entry : otherMetadata2.entrySet()) {
            byte[] value = entry.getValue();
            byte[] otherValue = map.get(entry.getKey());
            if (!Arrays.equals(value, otherValue)) {
                return false;
            }
        }
        return true;
    }

    public static byte[] A07(Object obj) {
        if (obj instanceof Long) {
            return ByteBuffer.allocate(8).putLong(((Long) obj).longValue()).array();
        }
        if (obj instanceof String) {
            return ((String) obj).getBytes(Charset.forName(A01(75, 5, 78)));
        }
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        throw new IllegalArgumentException();
    }

    public final C1314Un A08(IG ig) {
        Map<String, byte[]> A022 = A02(this.A01, ig);
        if (A06(A022)) {
            return this;
        }
        return new C1314Un(A022);
    }

    public final void A09(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(this.A01.size());
        for (Map.Entry<String, byte[]> entry : this.A01.entrySet()) {
            dataOutputStream.writeUTF(entry.getKey());
            byte[] value = entry.getValue();
            dataOutputStream.writeInt(value.length);
            dataOutputStream.write(value);
        }
    }

    @Override // com.facebook.ads.redexgen.X.IE
    public final long A5X(String str, long j10) {
        if (this.A01.containsKey(str)) {
            return ByteBuffer.wrap(this.A01.get(str)).getLong();
        }
        return j10;
    }

    @Override // com.facebook.ads.redexgen.X.IE
    public final String A5Z(String str, String str2) {
        if (this.A01.containsKey(str)) {
            return new String(this.A01.get(str), Charset.forName(A01(75, 5, 78)));
        }
        return str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return A06(((C1314Un) obj).A01);
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            int i10 = 0;
            Iterator<Map.Entry<String, byte[]>> it = this.A01.entrySet().iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                String[] strArr = A03;
                if (strArr[7].length() == strArr[0].length()) {
                    throw new RuntimeException();
                }
                A03[3] = "oFmiTb5ocNjXgy8itQp3Jt";
                if (hasNext) {
                    Map.Entry<String, byte[]> next = it.next();
                    i10 += next.getKey().hashCode() ^ Arrays.hashCode(next.getValue());
                } else {
                    this.A00 = i10;
                    break;
                }
            }
        }
        return this.A00;
    }
}
