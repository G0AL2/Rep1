package com.google.android.exoplayer2.metadata.emsg;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.ironsource.mediationsdk.logger.IronSourceError;
import ea.n0;
import j8.b2;
import j8.p1;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class EventMessage implements Metadata.Entry {

    /* renamed from: a  reason: collision with root package name */
    public final String f21148a;

    /* renamed from: b  reason: collision with root package name */
    public final String f21149b;

    /* renamed from: c  reason: collision with root package name */
    public final long f21150c;

    /* renamed from: d  reason: collision with root package name */
    public final long f21151d;

    /* renamed from: e  reason: collision with root package name */
    public final byte[] f21152e;

    /* renamed from: f  reason: collision with root package name */
    private int f21153f;

    /* renamed from: g  reason: collision with root package name */
    private static final p1 f21146g = new p1.b().e0("application/id3").E();

    /* renamed from: h  reason: collision with root package name */
    private static final p1 f21147h = new p1.b().e0("application/x-scte35").E();
    public static final Parcelable.Creator<EventMessage> CREATOR = new a();

    /* loaded from: classes2.dex */
    class a implements Parcelable.Creator<EventMessage> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public EventMessage createFromParcel(Parcel parcel) {
            return new EventMessage(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public EventMessage[] newArray(int i10) {
            return new EventMessage[i10];
        }
    }

    public EventMessage(String str, String str2, long j10, long j11, byte[] bArr) {
        this.f21148a = str;
        this.f21149b = str2;
        this.f21150c = j10;
        this.f21151d = j11;
        this.f21152e = bArr;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ void Z0(b2.b bVar) {
        c9.a.c(this, bVar);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public byte[] c1() {
        if (z() != null) {
            return this.f21152e;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || EventMessage.class != obj.getClass()) {
            return false;
        }
        EventMessage eventMessage = (EventMessage) obj;
        return this.f21150c == eventMessage.f21150c && this.f21151d == eventMessage.f21151d && n0.c(this.f21148a, eventMessage.f21148a) && n0.c(this.f21149b, eventMessage.f21149b) && Arrays.equals(this.f21152e, eventMessage.f21152e);
    }

    public int hashCode() {
        if (this.f21153f == 0) {
            String str = this.f21148a;
            int hashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f21149b;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            long j10 = this.f21150c;
            long j11 = this.f21151d;
            this.f21153f = ((((((hashCode + hashCode2) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + Arrays.hashCode(this.f21152e);
        }
        return this.f21153f;
    }

    public String toString() {
        String str = this.f21148a;
        long j10 = this.f21151d;
        long j11 = this.f21150c;
        String str2 = this.f21149b;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 79 + String.valueOf(str2).length());
        sb2.append("EMSG: scheme=");
        sb2.append(str);
        sb2.append(", id=");
        sb2.append(j10);
        sb2.append(", durationMs=");
        sb2.append(j11);
        sb2.append(", value=");
        sb2.append(str2);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f21148a);
        parcel.writeString(this.f21149b);
        parcel.writeLong(this.f21150c);
        parcel.writeLong(this.f21151d);
        parcel.writeByteArray(this.f21152e);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public p1 z() {
        String str = this.f21148a;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1468477611:
                if (str.equals("urn:scte:scte35:2014:bin")) {
                    c10 = 0;
                    break;
                }
                break;
            case -795945609:
                if (str.equals("https://aomedia.org/emsg/ID3")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1303648457:
                if (str.equals("https://developer.apple.com/streaming/emsg-id3")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return f21147h;
            case 1:
            case 2:
                return f21146g;
            default:
                return null;
        }
    }

    EventMessage(Parcel parcel) {
        this.f21148a = (String) n0.j(parcel.readString());
        this.f21149b = (String) n0.j(parcel.readString());
        this.f21150c = parcel.readLong();
        this.f21151d = parcel.readLong();
        this.f21152e = (byte[]) n0.j(parcel.createByteArray());
    }
}
