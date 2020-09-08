//imports...

Public class UserRepository{

 
   
     EntityManagerFactory emf = Persistence.createEntityManagerFactory("dataSource");
     EntityManager em = emf.createEntityManager();


// WOrking whith smartfoon typo
   Public static void outputExam(User user){
     em.getTransaction ().begin();
     User user = em.find(User.class ,6);
     System.out.println(user.toStrung());
     



 }





}

