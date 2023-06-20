package com.facebook.ads.internal.exoplayer2.trackselection;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.source.TrackGroupArray;
import com.facebook.ads.redexgen.X.C1020Iz;
import com.facebook.ads.redexgen.X.HI;
import com.google.android.gms.common.api.Api;
import java.util.HashMap;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class DefaultTrackSelector$Parameters implements Parcelable {
    public static String[] A0I = {"1uD1IV7D8X2FSwLSySpsMcd3fQZ0OK2I", "X8JDcoZekK8R8v3vEfyFt4rHK", "De3gnuhyaRRo1wIKKb0tF8p3R", "K68eMOOAXfhu3P8i4BL4WgotL7owvGg9", "YDqiP1KrSZLqrk6j1D4tO3HA5vwhMr0w", "rlifz9RYl4Hvs6rNSrBLCbq", "exa3hMIhu9HiMPspfK9jv5JkxYqQeWLn", "xGeCbtaF5ov5ZPZJ4BZzeMzjm9y5yA79"};
    public static final DefaultTrackSelector$Parameters A0J = new DefaultTrackSelector$Parameters();
    public static final Parcelable.Creator<DefaultTrackSelector$Parameters> CREATOR = new HI();
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    @Nullable
    public final String A07;
    @Nullable
    public final String A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final SparseArray<Map<TrackGroupArray, DefaultTrackSelector$SelectionOverride>> A0G;
    public final SparseBooleanArray A0H;

    public DefaultTrackSelector$Parameters() {
        this(new SparseArray(), new SparseBooleanArray(), null, null, false, 0, false, false, true, Api.BaseClientBuilder.API_PRIORITY_OTHER, Api.BaseClientBuilder.API_PRIORITY_OTHER, Api.BaseClientBuilder.API_PRIORITY_OTHER, true, true, Api.BaseClientBuilder.API_PRIORITY_OTHER, Api.BaseClientBuilder.API_PRIORITY_OTHER, true, 0);
    }

    public DefaultTrackSelector$Parameters(Parcel parcel) {
        this.A0G = A00(parcel);
        this.A0H = parcel.readSparseBooleanArray();
        this.A07 = parcel.readString();
        this.A08 = parcel.readString();
        this.A0E = C1020Iz.A0f(parcel);
        this.A00 = parcel.readInt();
        this.A0D = C1020Iz.A0f(parcel);
        this.A09 = C1020Iz.A0f(parcel);
        this.A0A = C1020Iz.A0f(parcel);
        this.A03 = parcel.readInt();
        this.A02 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A0C = C1020Iz.A0f(parcel);
        this.A0B = C1020Iz.A0f(parcel);
        this.A06 = parcel.readInt();
        this.A05 = parcel.readInt();
        this.A0F = C1020Iz.A0f(parcel);
        this.A04 = parcel.readInt();
    }

    public DefaultTrackSelector$Parameters(SparseArray<Map<TrackGroupArray, DefaultTrackSelector$SelectionOverride>> sparseArray, SparseBooleanArray sparseBooleanArray, @Nullable String str, @Nullable String str2, boolean z10, int i10, boolean z11, boolean z12, boolean z13, int i11, int i12, int i13, boolean z14, boolean z15, int i14, int i15, boolean z16, int i16) {
        this.A0G = sparseArray;
        this.A0H = sparseBooleanArray;
        this.A07 = C1020Iz.A0L(str);
        this.A08 = C1020Iz.A0L(str2);
        this.A0E = z10;
        this.A00 = i10;
        this.A0D = z11;
        this.A09 = z12;
        this.A0A = z13;
        this.A03 = i11;
        this.A02 = i12;
        this.A01 = i13;
        this.A0C = z14;
        this.A0B = z15;
        this.A06 = i14;
        this.A05 = i15;
        this.A0F = z16;
        this.A04 = i16;
    }

    public static SparseArray<Map<TrackGroupArray, DefaultTrackSelector$SelectionOverride>> A00(Parcel parcel) {
        int readInt = parcel.readInt();
        SparseArray<Map<TrackGroupArray, DefaultTrackSelector$SelectionOverride>> sparseArray = new SparseArray<>(readInt);
        for (int rendererIndex = 0; rendererIndex < readInt; rendererIndex++) {
            int overrideCount = parcel.readInt();
            int readInt2 = parcel.readInt();
            HashMap hashMap = new HashMap(readInt2);
            for (int i10 = 0; i10 < readInt2; i10++) {
                DefaultTrackSelector$SelectionOverride override = (DefaultTrackSelector$SelectionOverride) parcel.readParcelable(DefaultTrackSelector$SelectionOverride.class.getClassLoader());
                hashMap.put((TrackGroupArray) parcel.readParcelable(TrackGroupArray.class.getClassLoader()), override);
            }
            sparseArray.put(overrideCount, hashMap);
        }
        return sparseArray;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0065, code lost:
        r3 = r3 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A01(android.os.Parcel r7, android.util.SparseArray<java.util.Map<com.facebook.ads.internal.exoplayer2.source.TrackGroupArray, com.facebook.ads.internal.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride>> r8) {
        /*
            int r4 = r8.size()
            r7.writeInt(r4)
            r3 = 0
        L8:
            if (r3 >= r4) goto L68
            int r2 = r8.keyAt(r3)
            java.lang.Object r1 = r8.valueAt(r3)
            java.util.Map r1 = (java.util.Map) r1
            int r0 = r1.size()
            r7.writeInt(r2)
            r7.writeInt(r0)
            java.util.Set r0 = r1.entrySet()
            java.util.Iterator r6 = r0.iterator()
        L26:
            boolean r5 = r6.hasNext()
            java.lang.String[] r2 = com.facebook.ads.internal.exoplayer2.trackselection.DefaultTrackSelector$Parameters.A0I
            r0 = 1
            r1 = r2[r0]
            r0 = 2
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L42
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L42:
            java.lang.String[] r2 = com.facebook.ads.internal.exoplayer2.trackselection.DefaultTrackSelector$Parameters.A0I
            java.lang.String r1 = "Yf5UDYoyCKDeBovWDXdmYX2icwRNMgWM"
            r0 = 4
            r2[r0] = r1
            if (r5 == 0) goto L65
            java.lang.Object r2 = r6.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r0 = r2.getKey()
            android.os.Parcelable r0 = (android.os.Parcelable) r0
            r1 = 0
            r7.writeParcelable(r0, r1)
            java.lang.Object r0 = r2.getValue()
            android.os.Parcelable r0 = (android.os.Parcelable) r0
            r7.writeParcelable(r0, r1)
            goto L26
        L65:
            int r3 = r3 + 1
            goto L8
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.exoplayer2.trackselection.DefaultTrackSelector$Parameters.A01(android.os.Parcel, android.util.SparseArray):void");
    }

    public static boolean A02(SparseArray<Map<TrackGroupArray, DefaultTrackSelector$SelectionOverride>> sparseArray, SparseArray<Map<TrackGroupArray, DefaultTrackSelector$SelectionOverride>> sparseArray2) {
        int size = sparseArray.size();
        if (sparseArray2.size() != size) {
            return false;
        }
        for (int i10 = 0; i10 < size; i10++) {
            int indexInSecond = sparseArray2.indexOfKey(sparseArray.keyAt(i10));
            if (indexInSecond < 0 || !A04(sparseArray.valueAt(i10), sparseArray2.valueAt(indexInSecond))) {
                return false;
            }
        }
        return true;
    }

    public static boolean A03(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
        int size = sparseBooleanArray.size();
        if (sparseBooleanArray2.size() != size) {
            return false;
        }
        for (int i10 = 0; i10 < size; i10++) {
            if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i10)) < 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A04(java.util.Map<com.facebook.ads.internal.exoplayer2.source.TrackGroupArray, com.facebook.ads.internal.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride> r5, java.util.Map<com.facebook.ads.internal.exoplayer2.source.TrackGroupArray, com.facebook.ads.internal.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride> r6) {
        /*
            int r1 = r5.size()
            int r0 = r6.size()
            r4 = 0
            if (r0 == r1) goto Lc
            return r4
        Lc:
            java.util.Set r0 = r5.entrySet()
            java.util.Iterator r3 = r0.iterator()
        L14:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L3b
            java.lang.Object r1 = r3.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            com.facebook.ads.internal.exoplayer2.source.TrackGroupArray r2 = (com.facebook.ads.internal.exoplayer2.source.TrackGroupArray) r2
            boolean r0 = r6.containsKey(r2)
            if (r0 == 0) goto L3a
            java.lang.Object r1 = r1.getValue()
            java.lang.Object r0 = r6.get(r2)
            boolean r0 = com.facebook.ads.redexgen.X.C1020Iz.A0g(r1, r0)
            if (r0 != 0) goto L14
        L3a:
            return r4
        L3b:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.exoplayer2.trackselection.DefaultTrackSelector$Parameters.A04(java.util.Map, java.util.Map):boolean");
    }

    @Nullable
    public final DefaultTrackSelector$SelectionOverride A05(int i10, TrackGroupArray trackGroupArray) {
        Map<TrackGroupArray, DefaultTrackSelector$SelectionOverride> map = this.A0G.get(i10);
        if (map != null) {
            return map.get(trackGroupArray);
        }
        return null;
    }

    public final boolean A06(int i10) {
        return this.A0H.get(i10);
    }

    public final boolean A07(int i10, TrackGroupArray trackGroupArray) {
        Map<TrackGroupArray, DefaultTrackSelector$SelectionOverride> map = this.A0G.get(i10);
        return map != null && map.containsKey(trackGroupArray);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            Class<?> cls = getClass();
            Class<?> cls2 = obj.getClass();
            if (A0I[5].length() != 23) {
                throw new RuntimeException();
            }
            A0I[0] = "PTX86aGNYIw9JX3myOulYVpgRV6aH44E";
            if (cls == cls2) {
                DefaultTrackSelector$Parameters defaultTrackSelector$Parameters = (DefaultTrackSelector$Parameters) obj;
                if (this.A0E == defaultTrackSelector$Parameters.A0E && this.A00 == defaultTrackSelector$Parameters.A00 && this.A0D == defaultTrackSelector$Parameters.A0D && this.A09 == defaultTrackSelector$Parameters.A09 && this.A0A == defaultTrackSelector$Parameters.A0A && this.A03 == defaultTrackSelector$Parameters.A03 && this.A02 == defaultTrackSelector$Parameters.A02 && this.A0C == defaultTrackSelector$Parameters.A0C && this.A0B == defaultTrackSelector$Parameters.A0B && this.A0F == defaultTrackSelector$Parameters.A0F && this.A06 == defaultTrackSelector$Parameters.A06 && this.A05 == defaultTrackSelector$Parameters.A05 && this.A01 == defaultTrackSelector$Parameters.A01 && this.A04 == defaultTrackSelector$Parameters.A04 && TextUtils.equals(this.A07, defaultTrackSelector$Parameters.A07) && TextUtils.equals(this.A08, defaultTrackSelector$Parameters.A08) && A03(this.A0H, defaultTrackSelector$Parameters.A0H) && A02(this.A0G, defaultTrackSelector$Parameters.A0G)) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A0D ? 1 : 0;
        int result2 = this.A0A ? 1 : 0;
        int result3 = this.A02;
        int result4 = this.A0B ? 1 : 0;
        int result5 = this.A06;
        int result6 = this.A01;
        int i10 = (((((((((((((((((((((((((((this.A0E ? 1 : 0) * 31) + this.A00) * 31) + result) * 31) + (this.A09 ? 1 : 0)) * 31) + result2) * 31) + this.A03) * 31) + result3) * 31) + (this.A0C ? 1 : 0)) * 31) + result4) * 31) + (this.A0F ? 1 : 0)) * 31) + result5) * 31) + this.A05) * 31) + result6) * 31) + this.A04) * 31;
        String str = this.A07;
        int result7 = str == null ? 0 : str.hashCode();
        int i11 = (i10 + result7) * 31;
        String str2 = this.A08;
        return i11 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        A01(parcel, this.A0G);
        parcel.writeSparseBooleanArray(this.A0H);
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        C1020Iz.A0V(parcel, this.A0E);
        parcel.writeInt(this.A00);
        C1020Iz.A0V(parcel, this.A0D);
        C1020Iz.A0V(parcel, this.A09);
        C1020Iz.A0V(parcel, this.A0A);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A01);
        C1020Iz.A0V(parcel, this.A0C);
        C1020Iz.A0V(parcel, this.A0B);
        parcel.writeInt(this.A06);
        parcel.writeInt(this.A05);
        C1020Iz.A0V(parcel, this.A0F);
        parcel.writeInt(this.A04);
    }
}
