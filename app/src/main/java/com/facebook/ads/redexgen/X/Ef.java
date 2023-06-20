package com.facebook.ads.redexgen.X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.internal.exoplayer2.metadata.scte35.TimeSignalCommand;

/* loaded from: assets/audience_network.dex */
public class Ef implements Parcelable.Creator<TimeSignalCommand> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00 */
    public final TimeSignalCommand createFromParcel(Parcel parcel) {
        return new TimeSignalCommand(parcel.readLong(), parcel.readLong(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A01 */
    public final TimeSignalCommand[] newArray(int i10) {
        return new TimeSignalCommand[i10];
    }
}
