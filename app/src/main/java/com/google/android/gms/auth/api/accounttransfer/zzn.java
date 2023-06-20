package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzbz;
import com.vehiclecloud.app.videofetch.rndownloader.service.DownloadWorker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
@SafeParcelable.Class(creator = "AccountTransferMsgCreator")
/* loaded from: classes2.dex */
public final class zzn extends zzbz {
    public static final Parcelable.Creator<zzn> CREATOR = new zzo();
    private static final HashMap<String, FastJsonResponse.Field<?, ?>> zzc;
    @SafeParcelable.Indicator
    final Set<Integer> zza;
    @SafeParcelable.VersionField(id = 1)
    final int zzb;
    @SafeParcelable.Field(getter = "getAuthenticatorDatas", id = 2)
    private ArrayList<zzt> zzd;
    @SafeParcelable.Field(getter = "getRequestType", id = 3)
    private int zze;
    @SafeParcelable.Field(getter = "getProgress", id = 4)
    private zzr zzf;

    static {
        HashMap<String, FastJsonResponse.Field<?, ?>> hashMap = new HashMap<>();
        zzc = hashMap;
        hashMap.put("authenticatorData", FastJsonResponse.Field.forConcreteTypeArray("authenticatorData", 2, zzt.class));
        hashMap.put(DownloadWorker.KEY_OUT_PROGRESS, FastJsonResponse.Field.forConcreteType(DownloadWorker.KEY_OUT_PROGRESS, 4, zzr.class));
    }

    public zzn() {
        this.zza = new HashSet(1);
        this.zzb = 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final <T extends FastJsonResponse> void addConcreteTypeArrayInternal(FastJsonResponse.Field field, String str, ArrayList<T> arrayList) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId == 2) {
            this.zzd = arrayList;
            this.zza.add(Integer.valueOf(safeParcelableFieldId));
            return;
        }
        throw new IllegalArgumentException(String.format("Field with id=%d is not a known ConcreteTypeArray type. Found %s", Integer.valueOf(safeParcelableFieldId), arrayList.getClass().getCanonicalName()));
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final <T extends FastJsonResponse> void addConcreteTypeInternal(FastJsonResponse.Field field, String str, T t10) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId == 4) {
            this.zzf = (zzr) t10;
            this.zza.add(Integer.valueOf(safeParcelableFieldId));
            return;
        }
        throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", Integer.valueOf(safeParcelableFieldId), t10.getClass().getCanonicalName()));
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final /* bridge */ /* synthetic */ Map getFieldMappings() {
        return zzc;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final Object getFieldValue(FastJsonResponse.Field field) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId != 1) {
            if (safeParcelableFieldId != 2) {
                if (safeParcelableFieldId == 4) {
                    return this.zzf;
                }
                int safeParcelableFieldId2 = field.getSafeParcelableFieldId();
                StringBuilder sb2 = new StringBuilder(37);
                sb2.append("Unknown SafeParcelable id=");
                sb2.append(safeParcelableFieldId2);
                throw new IllegalStateException(sb2.toString());
            }
            return this.zzd;
        }
        return Integer.valueOf(this.zzb);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final boolean isFieldSet(FastJsonResponse.Field field) {
        return this.zza.contains(Integer.valueOf(field.getSafeParcelableFieldId()));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        Set<Integer> set = this.zza;
        if (set.contains(1)) {
            SafeParcelWriter.writeInt(parcel, 1, this.zzb);
        }
        if (set.contains(2)) {
            SafeParcelWriter.writeTypedList(parcel, 2, this.zzd, true);
        }
        if (set.contains(3)) {
            SafeParcelWriter.writeInt(parcel, 3, this.zze);
        }
        if (set.contains(4)) {
            SafeParcelWriter.writeParcelable(parcel, 4, this.zzf, i10, true);
        }
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zzn(@SafeParcelable.Indicator Set<Integer> set, @SafeParcelable.Param(id = 1) int i10, @SafeParcelable.Param(id = 2) ArrayList<zzt> arrayList, @SafeParcelable.Param(id = 3) int i11, @SafeParcelable.Param(id = 4) zzr zzrVar) {
        this.zza = set;
        this.zzb = i10;
        this.zzd = arrayList;
        this.zze = i11;
        this.zzf = zzrVar;
    }
}
