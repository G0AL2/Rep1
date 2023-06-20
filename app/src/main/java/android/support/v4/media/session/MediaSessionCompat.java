package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.media.MediaDescription;
import android.media.session.MediaSession;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class MediaSessionCompat {

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        ResultReceiver f641a;

        /* loaded from: classes.dex */
        class a implements Parcelable.Creator<ResultReceiverWrapper> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public ResultReceiverWrapper createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public ResultReceiverWrapper[] newArray(int i10) {
                return new ResultReceiverWrapper[i10];
            }
        }

        ResultReceiverWrapper(Parcel parcel) {
            this.f641a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            this.f641a.writeToParcel(parcel, i10);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        private final Object f642a;

        /* renamed from: b  reason: collision with root package name */
        private final Object f643b;

        /* renamed from: c  reason: collision with root package name */
        private b f644c;

        /* renamed from: d  reason: collision with root package name */
        private g1.b f645d;

        /* loaded from: classes.dex */
        class a implements Parcelable.Creator<Token> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public Token createFromParcel(Parcel parcel) {
                Object readStrongBinder;
                if (Build.VERSION.SDK_INT >= 21) {
                    readStrongBinder = parcel.readParcelable(null);
                } else {
                    readStrongBinder = parcel.readStrongBinder();
                }
                return new Token(readStrongBinder);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public Token[] newArray(int i10) {
                return new Token[i10];
            }
        }

        Token(Object obj) {
            this(obj, null, null);
        }

        public b c() {
            b bVar;
            synchronized (this.f642a) {
                bVar = this.f644c;
            }
            return bVar;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public void e(b bVar) {
            synchronized (this.f642a) {
                this.f644c = bVar;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Token) {
                Token token = (Token) obj;
                Object obj2 = this.f643b;
                if (obj2 == null) {
                    return token.f643b == null;
                }
                Object obj3 = token.f643b;
                if (obj3 == null) {
                    return false;
                }
                return obj2.equals(obj3);
            }
            return false;
        }

        public void f(g1.b bVar) {
            synchronized (this.f642a) {
                this.f645d = bVar;
            }
        }

        public int hashCode() {
            Object obj = this.f643b;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            if (Build.VERSION.SDK_INT >= 21) {
                parcel.writeParcelable((Parcelable) this.f643b, i10);
            } else {
                parcel.writeStrongBinder((IBinder) this.f643b);
            }
        }

        Token(Object obj, b bVar, g1.b bVar2) {
            this.f642a = new Object();
            this.f643b = obj;
            this.f644c = bVar;
            this.f645d = bVar2;
        }
    }

    static {
        e0.a.c();
    }

    public static void a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }

    public static Bundle b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        a(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        private final MediaDescriptionCompat f639a;

        /* renamed from: b  reason: collision with root package name */
        private final long f640b;

        /* loaded from: classes.dex */
        class a implements Parcelable.Creator<QueueItem> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public QueueItem[] newArray(int i10) {
                return new QueueItem[i10];
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public static class b {
            static MediaSession.QueueItem a(MediaDescription mediaDescription, long j10) {
                return new MediaSession.QueueItem(mediaDescription, j10);
            }

            static MediaDescription b(MediaSession.QueueItem queueItem) {
                return queueItem.getDescription();
            }

            static long c(MediaSession.QueueItem queueItem) {
                return queueItem.getQueueId();
            }
        }

        private QueueItem(MediaSession.QueueItem queueItem, MediaDescriptionCompat mediaDescriptionCompat, long j10) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null");
            }
            if (j10 != -1) {
                this.f639a = mediaDescriptionCompat;
                this.f640b = j10;
                return;
            }
            throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
        }

        public static QueueItem c(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            MediaSession.QueueItem queueItem = (MediaSession.QueueItem) obj;
            return new QueueItem(queueItem, MediaDescriptionCompat.c(b.b(queueItem)), b.c(queueItem));
        }

        public static List<QueueItem> e(List<?> list) {
            if (list == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<?> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(c(it.next()));
            }
            return arrayList;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "MediaSession.QueueItem {Description=" + this.f639a + ", Id=" + this.f640b + " }";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            this.f639a.writeToParcel(parcel, i10);
            parcel.writeLong(this.f640b);
        }

        QueueItem(Parcel parcel) {
            this.f639a = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f640b = parcel.readLong();
        }
    }
}
