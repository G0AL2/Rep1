package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;

/* compiled from: VersionedParcelParcel.java */
/* loaded from: classes.dex */
class b extends a {

    /* renamed from: d  reason: collision with root package name */
    private final SparseIntArray f4259d;

    /* renamed from: e  reason: collision with root package name */
    private final Parcel f4260e;

    /* renamed from: f  reason: collision with root package name */
    private final int f4261f;

    /* renamed from: g  reason: collision with root package name */
    private final int f4262g;

    /* renamed from: h  reason: collision with root package name */
    private final String f4263h;

    /* renamed from: i  reason: collision with root package name */
    private int f4264i;

    /* renamed from: j  reason: collision with root package name */
    private int f4265j;

    /* renamed from: k  reason: collision with root package name */
    private int f4266k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new androidx.collection.a(), new androidx.collection.a(), new androidx.collection.a());
    }

    @Override // androidx.versionedparcelable.a
    public void A(byte[] bArr) {
        if (bArr != null) {
            this.f4260e.writeInt(bArr.length);
            this.f4260e.writeByteArray(bArr);
            return;
        }
        this.f4260e.writeInt(-1);
    }

    @Override // androidx.versionedparcelable.a
    protected void C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f4260e, 0);
    }

    @Override // androidx.versionedparcelable.a
    public void E(int i10) {
        this.f4260e.writeInt(i10);
    }

    @Override // androidx.versionedparcelable.a
    public void G(Parcelable parcelable) {
        this.f4260e.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.a
    public void I(String str) {
        this.f4260e.writeString(str);
    }

    @Override // androidx.versionedparcelable.a
    public void a() {
        int i10 = this.f4264i;
        if (i10 >= 0) {
            int i11 = this.f4259d.get(i10);
            int dataPosition = this.f4260e.dataPosition();
            this.f4260e.setDataPosition(i11);
            this.f4260e.writeInt(dataPosition - i11);
            this.f4260e.setDataPosition(dataPosition);
        }
    }

    @Override // androidx.versionedparcelable.a
    protected a b() {
        Parcel parcel = this.f4260e;
        int dataPosition = parcel.dataPosition();
        int i10 = this.f4265j;
        if (i10 == this.f4261f) {
            i10 = this.f4262g;
        }
        int i11 = i10;
        return new b(parcel, dataPosition, i11, this.f4263h + "  ", this.f4256a, this.f4257b, this.f4258c);
    }

    @Override // androidx.versionedparcelable.a
    public boolean g() {
        return this.f4260e.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.a
    public byte[] i() {
        int readInt = this.f4260e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f4260e.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.a
    protected CharSequence k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f4260e);
    }

    @Override // androidx.versionedparcelable.a
    public boolean m(int i10) {
        while (this.f4265j < this.f4262g) {
            int i11 = this.f4266k;
            if (i11 == i10) {
                return true;
            }
            if (String.valueOf(i11).compareTo(String.valueOf(i10)) > 0) {
                return false;
            }
            this.f4260e.setDataPosition(this.f4265j);
            int readInt = this.f4260e.readInt();
            this.f4266k = this.f4260e.readInt();
            this.f4265j += readInt;
        }
        return this.f4266k == i10;
    }

    @Override // androidx.versionedparcelable.a
    public int o() {
        return this.f4260e.readInt();
    }

    @Override // androidx.versionedparcelable.a
    public <T extends Parcelable> T q() {
        return (T) this.f4260e.readParcelable(b.class.getClassLoader());
    }

    @Override // androidx.versionedparcelable.a
    public String s() {
        return this.f4260e.readString();
    }

    @Override // androidx.versionedparcelable.a
    public void w(int i10) {
        a();
        this.f4264i = i10;
        this.f4259d.put(i10, this.f4260e.dataPosition());
        E(0);
        E(i10);
    }

    @Override // androidx.versionedparcelable.a
    public void y(boolean z10) {
        this.f4260e.writeInt(z10 ? 1 : 0);
    }

    private b(Parcel parcel, int i10, int i11, String str, androidx.collection.a<String, Method> aVar, androidx.collection.a<String, Method> aVar2, androidx.collection.a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f4259d = new SparseIntArray();
        this.f4264i = -1;
        this.f4265j = 0;
        this.f4266k = -1;
        this.f4260e = parcel;
        this.f4261f = i10;
        this.f4262g = i11;
        this.f4265j = i10;
        this.f4263h = str;
    }
}
