package local.petclinic.bootstrap;

import local.petclinic.model.Owner;
import local.petclinic.model.Vet;
import local.petclinic.services.OwnerService;
import local.petclinic.services.VetService;
import local.petclinic.services.map.OwnerServiceMap;
import local.petclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService = new OwnerServiceMap();
    private final VetService vetService = new VetServiceMap();


    @Override
    public void run(String... args) throws Exception {
            loadData();
    }

    private void loadData() {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
        ownerService.save(owner2);

        System.out.println("Loaded Owners....");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");
        vetService.save(vet2);

        System.out.println("Loaded Vets....");

    }

}