package cb;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public abstract class o0 extends j0 implements p0 {
    public o0() {
        super("com.google.android.play.core.assetpacks.protocol.IAssetModuleServiceCallback");
    }

    @Override // cb.j0
    protected final boolean X(int i10, Parcel parcel) throws RemoteException {
        switch (i10) {
            case 2:
                M(parcel.readInt(), (Bundle) k0.a(parcel, Bundle.CREATOR));
                return true;
            case 3:
                int readInt = parcel.readInt();
                Bundle bundle = (Bundle) k0.a(parcel, Bundle.CREATOR);
                a(readInt);
                return true;
            case 4:
                int readInt2 = parcel.readInt();
                Bundle bundle2 = (Bundle) k0.a(parcel, Bundle.CREATOR);
                b(readInt2);
                return true;
            case 5:
                a(parcel.createTypedArrayList(Bundle.CREATOR));
                return true;
            case 6:
                Parcelable.Creator creator = Bundle.CREATOR;
                Bundle bundle3 = (Bundle) k0.a(parcel, creator);
                c((Bundle) k0.a(parcel, creator));
                return true;
            case 7:
                a((Bundle) k0.a(parcel, Bundle.CREATOR));
                return true;
            case 8:
                Parcelable.Creator creator2 = Bundle.CREATOR;
                Bundle bundle4 = (Bundle) k0.a(parcel, creator2);
                f((Bundle) k0.a(parcel, creator2));
                return true;
            case 9:
            default:
                return false;
            case 10:
                Parcelable.Creator creator3 = Bundle.CREATOR;
                Bundle bundle5 = (Bundle) k0.a(parcel, creator3);
                N((Bundle) k0.a(parcel, creator3));
                return true;
            case 11:
                Parcelable.Creator creator4 = Bundle.CREATOR;
                b((Bundle) k0.a(parcel, creator4), (Bundle) k0.a(parcel, creator4));
                return true;
            case 12:
                Parcelable.Creator creator5 = Bundle.CREATOR;
                h((Bundle) k0.a(parcel, creator5), (Bundle) k0.a(parcel, creator5));
                return true;
            case 13:
                Parcelable.Creator creator6 = Bundle.CREATOR;
                L((Bundle) k0.a(parcel, creator6), (Bundle) k0.a(parcel, creator6));
                return true;
            case 14:
                Parcelable.Creator creator7 = Bundle.CREATOR;
                Bundle bundle6 = (Bundle) k0.a(parcel, creator7);
                Bundle bundle7 = (Bundle) k0.a(parcel, creator7);
                b();
                return true;
            case 15:
                Bundle bundle8 = (Bundle) k0.a(parcel, Bundle.CREATOR);
                a();
                return true;
        }
    }
}
