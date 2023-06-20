package com.amazon.device.ads;

import com.amazon.device.ads.DTBBidInspector;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes.dex */
public class DTBBidInspector {
    private static final int INSPECTION_PERIOD = 180000;
    private static final int RETENTION_INTERVAL = 480000;
    static DTBBidInspector theInstance = new DTBBidInspector();
    private List<BidDescriptor> bids = new ArrayList();
    private Timer timer;

    /* renamed from: com.amazon.device.ads.DTBBidInspector$1 */
    /* loaded from: classes.dex */
    public class AnonymousClass1 extends TimerTask {
        AnonymousClass1() {
            DTBBidInspector.this = r1;
        }

        public static /* synthetic */ void a(AnonymousClass1 anonymousClass1) {
            anonymousClass1.lambda$run$0();
        }

        public /* synthetic */ void lambda$run$0() {
            DTBBidInspector.this.purge();
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            DtbThreadService.getInstance().execute(new Runnable() { // from class: com.amazon.device.ads.e0
                @Override // java.lang.Runnable
                public final void run() {
                    DTBBidInspector.AnonymousClass1.a(DTBBidInspector.AnonymousClass1.this);
                }
            });
        }
    }

    /* loaded from: classes.dex */
    public class BidDescriptor {
        String bidId;
        long bidTime;

        BidDescriptor() {
            DTBBidInspector.this = r1;
        }
    }

    private DTBBidInspector() {
        Timer timer = new Timer();
        this.timer = timer;
        timer.schedule(new AnonymousClass1(), 180000L, 180000L);
    }

    public static DTBBidInspector getInstance() {
        return theInstance;
    }

    public synchronized void purge() {
        long time = new Date().getTime();
        Iterator<BidDescriptor> it = this.bids.iterator();
        int i10 = 0;
        while (it.hasNext() && time - it.next().bidTime > 480000) {
            i10++;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            this.bids.remove(0);
        }
    }

    public synchronized void addBid(String str) {
        BidDescriptor bidDescriptor = new BidDescriptor();
        bidDescriptor.bidId = str;
        bidDescriptor.bidTime = new Date().getTime();
        this.bids.add(bidDescriptor);
    }

    public synchronized boolean wasUsed(String str) {
        for (BidDescriptor bidDescriptor : this.bids) {
            if (bidDescriptor.bidId.equals(str)) {
                this.bids.remove(bidDescriptor);
                return false;
            }
        }
        return true;
    }
}
