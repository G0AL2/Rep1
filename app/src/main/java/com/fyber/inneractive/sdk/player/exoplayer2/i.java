package com.fyber.inneractive.sdk.player.exoplayer2;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaFormat;
import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.u;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class i implements Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new a();
    public int A;

    /* renamed from: a  reason: collision with root package name */
    public final String f19114a;

    /* renamed from: b  reason: collision with root package name */
    public final int f19115b;

    /* renamed from: c  reason: collision with root package name */
    public final String f19116c;

    /* renamed from: d  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.metadata.a f19117d;

    /* renamed from: e  reason: collision with root package name */
    public final String f19118e;

    /* renamed from: f  reason: collision with root package name */
    public final String f19119f;

    /* renamed from: g  reason: collision with root package name */
    public final int f19120g;

    /* renamed from: h  reason: collision with root package name */
    public final List<byte[]> f19121h;

    /* renamed from: i  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.drm.a f19122i;

    /* renamed from: j  reason: collision with root package name */
    public final int f19123j;

    /* renamed from: k  reason: collision with root package name */
    public final int f19124k;

    /* renamed from: l  reason: collision with root package name */
    public final float f19125l;

    /* renamed from: m  reason: collision with root package name */
    public final int f19126m;

    /* renamed from: n  reason: collision with root package name */
    public final float f19127n;

    /* renamed from: o  reason: collision with root package name */
    public final int f19128o;

    /* renamed from: p  reason: collision with root package name */
    public final byte[] f19129p;

    /* renamed from: q  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.video.b f19130q;

    /* renamed from: r  reason: collision with root package name */
    public final int f19131r;

    /* renamed from: s  reason: collision with root package name */
    public final int f19132s;

    /* renamed from: t  reason: collision with root package name */
    public final int f19133t;

    /* renamed from: u  reason: collision with root package name */
    public final int f19134u;

    /* renamed from: v  reason: collision with root package name */
    public final int f19135v;

    /* renamed from: w  reason: collision with root package name */
    public final long f19136w;

    /* renamed from: x  reason: collision with root package name */
    public final int f19137x;

    /* renamed from: y  reason: collision with root package name */
    public final String f19138y;

    /* renamed from: z  reason: collision with root package name */
    public final int f19139z;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<i> {
        @Override // android.os.Parcelable.Creator
        public i createFromParcel(Parcel parcel) {
            return new i(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public i[] newArray(int i10) {
            return new i[i10];
        }
    }

    public i(String str, String str2, String str3, String str4, int i10, int i11, int i12, int i13, float f10, int i14, float f11, byte[] bArr, int i15, com.fyber.inneractive.sdk.player.exoplayer2.video.b bVar, int i16, int i17, int i18, int i19, int i20, int i21, String str5, int i22, long j10, List<byte[]> list, com.fyber.inneractive.sdk.player.exoplayer2.drm.a aVar, com.fyber.inneractive.sdk.player.exoplayer2.metadata.a aVar2) {
        this.f19114a = str;
        this.f19118e = str2;
        this.f19119f = str3;
        this.f19116c = str4;
        this.f19115b = i10;
        this.f19120g = i11;
        this.f19123j = i12;
        this.f19124k = i13;
        this.f19125l = f10;
        this.f19126m = i14;
        this.f19127n = f11;
        this.f19129p = bArr;
        this.f19128o = i15;
        this.f19130q = bVar;
        this.f19131r = i16;
        this.f19132s = i17;
        this.f19133t = i18;
        this.f19134u = i19;
        this.f19135v = i20;
        this.f19137x = i21;
        this.f19138y = str5;
        this.f19139z = i22;
        this.f19136w = j10;
        this.f19121h = list == null ? Collections.emptyList() : list;
        this.f19122i = aVar;
        this.f19117d = aVar2;
    }

    public static i a(String str, String str2, String str3, int i10, int i11, int i12, int i13, float f10, List<byte[]> list, int i14, float f11, com.fyber.inneractive.sdk.player.exoplayer2.drm.a aVar) {
        return a(str, str2, (String) null, i10, i11, i12, i13, f10, list, i14, f11, (byte[]) null, -1, (com.fyber.inneractive.sdk.player.exoplayer2.video.b) null, (com.fyber.inneractive.sdk.player.exoplayer2.drm.a) null);
    }

    public int b() {
        int i10;
        int i11 = this.f19123j;
        if (i11 == -1 || (i10 = this.f19124k) == -1) {
            return -1;
        }
        return i11 * i10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            i iVar = (i) obj;
            if (this.f19115b == iVar.f19115b && this.f19120g == iVar.f19120g && this.f19123j == iVar.f19123j && this.f19124k == iVar.f19124k && this.f19125l == iVar.f19125l && this.f19126m == iVar.f19126m && this.f19127n == iVar.f19127n && this.f19128o == iVar.f19128o && this.f19131r == iVar.f19131r && this.f19132s == iVar.f19132s && this.f19133t == iVar.f19133t && this.f19134u == iVar.f19134u && this.f19135v == iVar.f19135v && this.f19136w == iVar.f19136w && this.f19137x == iVar.f19137x && u.a(this.f19114a, iVar.f19114a) && u.a(this.f19138y, iVar.f19138y) && this.f19139z == iVar.f19139z && u.a(this.f19118e, iVar.f19118e) && u.a(this.f19119f, iVar.f19119f) && u.a(this.f19116c, iVar.f19116c) && u.a(this.f19122i, iVar.f19122i) && u.a(this.f19117d, iVar.f19117d) && u.a(this.f19130q, iVar.f19130q) && Arrays.equals(this.f19129p, iVar.f19129p) && this.f19121h.size() == iVar.f19121h.size()) {
                for (int i10 = 0; i10 < this.f19121h.size(); i10++) {
                    if (!Arrays.equals(this.f19121h.get(i10), iVar.f19121h.get(i10))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.A == 0) {
            String str = this.f19114a;
            int hashCode = ((str == null ? 0 : str.hashCode()) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
            String str2 = this.f19118e;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f19119f;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f19116c;
            int hashCode4 = (((((((((((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.f19115b) * 31) + this.f19123j) * 31) + this.f19124k) * 31) + this.f19131r) * 31) + this.f19132s) * 31;
            String str5 = this.f19138y;
            int hashCode5 = (((hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.f19139z) * 31;
            com.fyber.inneractive.sdk.player.exoplayer2.drm.a aVar = this.f19122i;
            int hashCode6 = (hashCode5 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.a aVar2 = this.f19117d;
            this.A = hashCode6 + (aVar2 != null ? Arrays.hashCode(aVar2.f19180a) : 0);
        }
        return this.A;
    }

    public String toString() {
        return "Format(" + this.f19114a + ", " + this.f19118e + ", " + this.f19119f + ", " + this.f19115b + ", " + this.f19138y + ", [" + this.f19123j + ", " + this.f19124k + ", " + this.f19125l + "], [" + this.f19131r + ", " + this.f19132s + "])";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f19114a);
        parcel.writeString(this.f19118e);
        parcel.writeString(this.f19119f);
        parcel.writeString(this.f19116c);
        parcel.writeInt(this.f19115b);
        parcel.writeInt(this.f19120g);
        parcel.writeInt(this.f19123j);
        parcel.writeInt(this.f19124k);
        parcel.writeFloat(this.f19125l);
        parcel.writeInt(this.f19126m);
        parcel.writeFloat(this.f19127n);
        parcel.writeInt(this.f19129p != null ? 1 : 0);
        byte[] bArr = this.f19129p;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.f19128o);
        parcel.writeParcelable(this.f19130q, i10);
        parcel.writeInt(this.f19131r);
        parcel.writeInt(this.f19132s);
        parcel.writeInt(this.f19133t);
        parcel.writeInt(this.f19134u);
        parcel.writeInt(this.f19135v);
        parcel.writeInt(this.f19137x);
        parcel.writeString(this.f19138y);
        parcel.writeInt(this.f19139z);
        parcel.writeLong(this.f19136w);
        int size = this.f19121h.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeByteArray(this.f19121h.get(i11));
        }
        parcel.writeParcelable(this.f19122i, 0);
        parcel.writeParcelable(this.f19117d, 0);
    }

    public static i a(String str, String str2, String str3, int i10, int i11, int i12, int i13, float f10, List<byte[]> list, int i14, float f11, byte[] bArr, int i15, com.fyber.inneractive.sdk.player.exoplayer2.video.b bVar, com.fyber.inneractive.sdk.player.exoplayer2.drm.a aVar) {
        return new i(str, null, str2, str3, i10, i11, i12, i13, f10, i14, f11, bArr, i15, bVar, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, list, aVar, null);
    }

    public static i a(String str, String str2, String str3, int i10, int i11, int i12, int i13, int i14, List<byte[]> list, com.fyber.inneractive.sdk.player.exoplayer2.drm.a aVar, int i15, String str4) {
        return a(str, str2, str3, i10, i11, i12, i13, i14, -1, -1, list, aVar, i15, str4, (com.fyber.inneractive.sdk.player.exoplayer2.metadata.a) null);
    }

    public static i a(String str, String str2, String str3, int i10, int i11, int i12, int i13, int i14, int i15, int i16, List<byte[]> list, com.fyber.inneractive.sdk.player.exoplayer2.drm.a aVar, int i17, String str4, com.fyber.inneractive.sdk.player.exoplayer2.metadata.a aVar2) {
        return new i(str, null, str2, str3, i10, i11, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i12, i13, i14, i15, i16, i17, str4, -1, Long.MAX_VALUE, list, aVar, aVar2);
    }

    public static i a(String str, String str2, String str3, String str4, int i10, int i11, String str5, int i12) {
        return new i(str, str2, str3, str4, i10, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i11, str5, i12, Long.MAX_VALUE, null, null, null);
    }

    public static i a(String str, String str2, String str3, int i10, int i11, String str4, com.fyber.inneractive.sdk.player.exoplayer2.drm.a aVar) {
        return a(str, str2, null, i10, i11, str4, -1, aVar, Long.MAX_VALUE, Collections.emptyList());
    }

    public static i a(String str, String str2, String str3, int i10, int i11, String str4, int i12, com.fyber.inneractive.sdk.player.exoplayer2.drm.a aVar, long j10, List<byte[]> list) {
        return new i(str, null, str2, str3, i10, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i11, str4, i12, j10, list, aVar, null);
    }

    public static i a(String str, String str2, String str3, int i10, List<byte[]> list, String str4, com.fyber.inneractive.sdk.player.exoplayer2.drm.a aVar) {
        return new i(str, null, str2, null, i10, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, str4, -1, Long.MAX_VALUE, list, aVar, null);
    }

    public static i a(String str, String str2, long j10) {
        return new i(null, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, j10, null, null, null);
    }

    public static i a(String str, String str2, String str3, int i10, com.fyber.inneractive.sdk.player.exoplayer2.drm.a aVar) {
        return new i(str, null, str2, null, i10, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, null, aVar, null);
    }

    public i a(long j10) {
        return new i(this.f19114a, this.f19118e, this.f19119f, this.f19116c, this.f19115b, this.f19120g, this.f19123j, this.f19124k, this.f19125l, this.f19126m, this.f19127n, this.f19129p, this.f19128o, this.f19130q, this.f19131r, this.f19132s, this.f19133t, this.f19134u, this.f19135v, this.f19137x, this.f19138y, this.f19139z, j10, this.f19121h, this.f19122i, this.f19117d);
    }

    @SuppressLint({"InlinedApi"})
    @TargetApi(16)
    public final MediaFormat a() {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", this.f19119f);
        String str = this.f19138y;
        if (str != null) {
            mediaFormat.setString("language", str);
        }
        a(mediaFormat, "max-input-size", this.f19120g);
        a(mediaFormat, "width", this.f19123j);
        a(mediaFormat, "height", this.f19124k);
        float f10 = this.f19125l;
        if (f10 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f10);
        }
        a(mediaFormat, "rotation-degrees", this.f19126m);
        a(mediaFormat, "channel-count", this.f19131r);
        a(mediaFormat, "sample-rate", this.f19132s);
        a(mediaFormat, "encoder-delay", this.f19134u);
        a(mediaFormat, "encoder-padding", this.f19135v);
        for (int i10 = 0; i10 < this.f19121h.size(); i10++) {
            mediaFormat.setByteBuffer("csd-" + i10, ByteBuffer.wrap(this.f19121h.get(i10)));
        }
        com.fyber.inneractive.sdk.player.exoplayer2.video.b bVar = this.f19130q;
        if (bVar != null) {
            a(mediaFormat, "color-transfer", bVar.f19669c);
            a(mediaFormat, "color-standard", bVar.f19667a);
            a(mediaFormat, "color-range", bVar.f19668b);
            byte[] bArr = bVar.f19670d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        return mediaFormat;
    }

    public i(Parcel parcel) {
        this.f19114a = parcel.readString();
        this.f19118e = parcel.readString();
        this.f19119f = parcel.readString();
        this.f19116c = parcel.readString();
        this.f19115b = parcel.readInt();
        this.f19120g = parcel.readInt();
        this.f19123j = parcel.readInt();
        this.f19124k = parcel.readInt();
        this.f19125l = parcel.readFloat();
        this.f19126m = parcel.readInt();
        this.f19127n = parcel.readFloat();
        this.f19129p = parcel.readInt() != 0 ? parcel.createByteArray() : null;
        this.f19128o = parcel.readInt();
        this.f19130q = (com.fyber.inneractive.sdk.player.exoplayer2.video.b) parcel.readParcelable(com.fyber.inneractive.sdk.player.exoplayer2.video.b.class.getClassLoader());
        this.f19131r = parcel.readInt();
        this.f19132s = parcel.readInt();
        this.f19133t = parcel.readInt();
        this.f19134u = parcel.readInt();
        this.f19135v = parcel.readInt();
        this.f19137x = parcel.readInt();
        this.f19138y = parcel.readString();
        this.f19139z = parcel.readInt();
        this.f19136w = parcel.readLong();
        int readInt = parcel.readInt();
        this.f19121h = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            this.f19121h.add(parcel.createByteArray());
        }
        this.f19122i = (com.fyber.inneractive.sdk.player.exoplayer2.drm.a) parcel.readParcelable(com.fyber.inneractive.sdk.player.exoplayer2.drm.a.class.getClassLoader());
        this.f19117d = (com.fyber.inneractive.sdk.player.exoplayer2.metadata.a) parcel.readParcelable(com.fyber.inneractive.sdk.player.exoplayer2.metadata.a.class.getClassLoader());
    }

    @TargetApi(16)
    public static void a(MediaFormat mediaFormat, String str, int i10) {
        if (i10 != -1) {
            mediaFormat.setInteger(str, i10);
        }
    }
}
