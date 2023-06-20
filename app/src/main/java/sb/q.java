package sb;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p002firebaseauthapi.zzwi;
import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* loaded from: classes3.dex */
public final class q {
    public static MultiFactorInfo a(zzwi zzwiVar) {
        if (zzwiVar == null || TextUtils.isEmpty(zzwiVar.zze())) {
            return null;
        }
        return new PhoneMultiFactorInfo(zzwiVar.zzd(), zzwiVar.zzc(), zzwiVar.zza(), Preconditions.checkNotEmpty(zzwiVar.zze()));
    }

    public static List b(List list) {
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                MultiFactorInfo a10 = a((zzwi) it.next());
                if (a10 != null) {
                    arrayList.add(a10);
                }
            }
            return arrayList;
        }
        return new ArrayList();
    }
}
