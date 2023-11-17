package Service;

import Model.Subscribe;
import Repository.SubscribeCrudOperation;

import java.util.ArrayList;
import java.util.List;

public class ServiceSubscribe {
    public  static  void TestCrudSubscribe(){

        SubscribeCrudOperation subscribes = new SubscribeCrudOperation();

        // Save subscribe :
        Subscribe subscribe = new Subscribe(4,"RAKOTONIRINA","Fitahiana","fita@gmail.com",'M',"123344454");
        subscribes.save(subscribe);

        // Save List of subscribe :
        List<Subscribe> subscribeList = new ArrayList<>();
        subscribeList.add(new Subscribe(5,"RAMBELOSON","Fifa","fifa@gmail.com",'M',"1234555"));
        subscribeList.add(new Subscribe(6,"RANDRIAMANAREFO","Maharavo","mah@gmai.coom",'M',"1234556"));
        subscribes.saveAll(subscribeList);

        // Delete subscribe :
        subscribes.delete(subscribe);

        // List of subscribe :
        subscribes.findAll();
    }
}
