package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    final int f651a;

    /* renamed from: b  reason: collision with root package name */
    final long f652b;

    /* renamed from: c  reason: collision with root package name */
    final long f653c;

    /* renamed from: d  reason: collision with root package name */
    final float f654d;

    /* renamed from: e  reason: collision with root package name */
    final long f655e;

    /* renamed from: f  reason: collision with root package name */
    final int f656f;

    /* renamed from: g  reason: collision with root package name */
    final CharSequence f657g;

    /* renamed from: h  reason: collision with root package name */
    final long f658h;

    /* renamed from: i  reason: collision with root package name */
    List<CustomAction> f659i;

    /* renamed from: j  reason: collision with root package name */
    final long f660j;

    /* renamed from: k  reason: collision with root package name */
    final Bundle f661k;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<PlaybackStateCompat> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public PlaybackStateCompat[] newArray(int i10) {
            return new PlaybackStateCompat[i10];
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b {
        static void a(PlaybackState.Builder builder, PlaybackState.CustomAction customAction) {
            builder.addCustomAction(customAction);
        }

        static PlaybackState.CustomAction b(PlaybackState.CustomAction.Builder builder) {
            return builder.build();
        }

        static PlaybackState c(PlaybackState.Builder builder) {
            return builder.build();
        }

        static PlaybackState.Builder d() {
            return new PlaybackState.Builder();
        }

        static PlaybackState.CustomAction.Builder e(String str, CharSequence charSequence, int i10) {
            return new PlaybackState.CustomAction.Builder(str, charSequence, i10);
        }

        static String f(PlaybackState.CustomAction customAction) {
            return customAction.getAction();
        }

        static long g(PlaybackState playbackState) {
            return playbackState.getActions();
        }

        static long h(PlaybackState playbackState) {
            return playbackState.getActiveQueueItemId();
        }

        static long i(PlaybackState playbackState) {
            return playbackState.getBufferedPosition();
        }

        static List<PlaybackState.CustomAction> j(PlaybackState playbackState) {
            return playbackState.getCustomActions();
        }

        static CharSequence k(PlaybackState playbackState) {
            return playbackState.getErrorMessage();
        }

        static Bundle l(PlaybackState.CustomAction customAction) {
            return customAction.getExtras();
        }

        static int m(PlaybackState.CustomAction customAction) {
            return customAction.getIcon();
        }

        static long n(PlaybackState playbackState) {
            return playbackState.getLastPositionUpdateTime();
        }

        static CharSequence o(PlaybackState.CustomAction customAction) {
            return customAction.getName();
        }

        static float p(PlaybackState playbackState) {
            return playbackState.getPlaybackSpeed();
        }

        static long q(PlaybackState playbackState) {
            return playbackState.getPosition();
        }

        static int r(PlaybackState playbackState) {
            return playbackState.getState();
        }

        static void s(PlaybackState.Builder builder, long j10) {
            builder.setActions(j10);
        }

        static void t(PlaybackState.Builder builder, long j10) {
            builder.setActiveQueueItemId(j10);
        }

        static void u(PlaybackState.Builder builder, long j10) {
            builder.setBufferedPosition(j10);
        }

        static void v(PlaybackState.Builder builder, CharSequence charSequence) {
            builder.setErrorMessage(charSequence);
        }

        static void w(PlaybackState.CustomAction.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }

        static void x(PlaybackState.Builder builder, int i10, long j10, float f10, long j11) {
            builder.setState(i10, j10, f10, j11);
        }
    }

    /* loaded from: classes.dex */
    private static class c {
        static Bundle a(PlaybackState playbackState) {
            return playbackState.getExtras();
        }

        static void b(PlaybackState.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }
    }

    PlaybackStateCompat(int i10, long j10, long j11, float f10, long j12, int i11, CharSequence charSequence, long j13, List<CustomAction> list, long j14, Bundle bundle) {
        this.f651a = i10;
        this.f652b = j10;
        this.f653c = j11;
        this.f654d = f10;
        this.f655e = j12;
        this.f656f = i11;
        this.f657g = charSequence;
        this.f658h = j13;
        this.f659i = new ArrayList(list);
        this.f660j = j14;
        this.f661k = bundle;
    }

    public static PlaybackStateCompat c(Object obj) {
        ArrayList arrayList;
        Bundle bundle = null;
        if (obj == null || Build.VERSION.SDK_INT < 21) {
            return null;
        }
        PlaybackState playbackState = (PlaybackState) obj;
        List<PlaybackState.CustomAction> j10 = b.j(playbackState);
        if (j10 != null) {
            ArrayList arrayList2 = new ArrayList(j10.size());
            for (PlaybackState.CustomAction customAction : j10) {
                arrayList2.add(CustomAction.c(customAction));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        if (Build.VERSION.SDK_INT >= 22) {
            bundle = c.a(playbackState);
            MediaSessionCompat.a(bundle);
        }
        return new PlaybackStateCompat(b.r(playbackState), b.q(playbackState), b.i(playbackState), b.p(playbackState), b.g(playbackState), 0, b.k(playbackState), b.n(playbackState), arrayList, b.h(playbackState), bundle);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PlaybackState {state=" + this.f651a + ", position=" + this.f652b + ", buffered position=" + this.f653c + ", speed=" + this.f654d + ", updated=" + this.f658h + ", actions=" + this.f655e + ", error code=" + this.f656f + ", error message=" + this.f657g + ", custom actions=" + this.f659i + ", active item id=" + this.f660j + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f651a);
        parcel.writeLong(this.f652b);
        parcel.writeFloat(this.f654d);
        parcel.writeLong(this.f658h);
        parcel.writeLong(this.f653c);
        parcel.writeLong(this.f655e);
        TextUtils.writeToParcel(this.f657g, parcel, i10);
        parcel.writeTypedList(this.f659i);
        parcel.writeLong(this.f660j);
        parcel.writeBundle(this.f661k);
        parcel.writeInt(this.f656f);
    }

    /* loaded from: classes.dex */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        private final String f662a;

        /* renamed from: b  reason: collision with root package name */
        private final CharSequence f663b;

        /* renamed from: c  reason: collision with root package name */
        private final int f664c;

        /* renamed from: d  reason: collision with root package name */
        private final Bundle f665d;

        /* loaded from: classes.dex */
        class a implements Parcelable.Creator<CustomAction> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public CustomAction[] newArray(int i10) {
                return new CustomAction[i10];
            }
        }

        CustomAction(String str, CharSequence charSequence, int i10, Bundle bundle) {
            this.f662a = str;
            this.f663b = charSequence;
            this.f664c = i10;
            this.f665d = bundle;
        }

        public static CustomAction c(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            PlaybackState.CustomAction customAction = (PlaybackState.CustomAction) obj;
            Bundle l10 = b.l(customAction);
            MediaSessionCompat.a(l10);
            return new CustomAction(b.f(customAction), b.o(customAction), b.m(customAction), l10);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + ((Object) this.f663b) + ", mIcon=" + this.f664c + ", mExtras=" + this.f665d;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f662a);
            TextUtils.writeToParcel(this.f663b, parcel, i10);
            parcel.writeInt(this.f664c);
            parcel.writeBundle(this.f665d);
        }

        CustomAction(Parcel parcel) {
            this.f662a = parcel.readString();
            this.f663b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f664c = parcel.readInt();
            this.f665d = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f651a = parcel.readInt();
        this.f652b = parcel.readLong();
        this.f654d = parcel.readFloat();
        this.f658h = parcel.readLong();
        this.f653c = parcel.readLong();
        this.f655e = parcel.readLong();
        this.f657g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f659i = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f660j = parcel.readLong();
        this.f661k = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f656f = parcel.readInt();
    }
}
