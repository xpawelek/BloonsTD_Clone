package app.model;

import app.utils.AppConstans;
import javafx.scene.image.ImageView;

public class SuperheroTower extends DartTower{
    public SuperheroTower() {
        init();
    }

    public SuperheroTower(double positionX, double positionY) {
        super(positionX, positionY);
        init();
    }

    private void init() {
        this.towerImagePath = "/app/view/assets/images/superman_tower.png";
        this.firstUpgradeImagePath = "/app/view/assets/images/dart_tower_first_upgrade.png";
        this.secondUpgradeImagePath = "/app/view/assets/images/dart_tower_second_upgrade.png";
        this.towerImg = new ImageView(towerImagePath);
        this.fire_cooldown = 180;
        this.priceValue = 1250;
        this.firstUpgradePrice = 400;
        this.secondUpgradePrice = 600;
        this.range = 145;
    }

    @Override
    public void manageFirstUpgrade()
    {
        this.priceValue += getFirstUpgradePrice();
        this.setFirstUpgradeBought();
        AppConstans.gameState.updateMoneyAfterBuying(getFirstUpgradePrice());

        this.fire_cooldown *= 0.8;
    }

    @Override
    public void manageSecondUpgrade()
    {
        this.priceValue += getSecondUpgradePrice();
        this.setSecondUpgradeBought();
        AppConstans.gameState.updateMoneyAfterBuying(getSecondUpgradePrice());

        this.range = 170;
    }
}
