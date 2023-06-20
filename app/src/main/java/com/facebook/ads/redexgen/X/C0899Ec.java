package com.facebook.ads.redexgen.X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.internal.exoplayer2.metadata.scte35.SpliceScheduleCommand;

/* renamed from: com.facebook.ads.redexgen.X.Ec  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0899Ec implements Parcelable.Creator<SpliceScheduleCommand> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00 */
    public final SpliceScheduleCommand createFromParcel(Parcel parcel) {
        return new SpliceScheduleCommand(parcel, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A01 */
    public final SpliceScheduleCommand[] newArray(int i10) {
        return new SpliceScheduleCommand[i10];
    }
}
