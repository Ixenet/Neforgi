class ClothingItem {
    constructor(id, name, price, pictureUrl) {
        this.id = id;
        this.price = price;
        this.name = name;
        this.pictureUrl = pictureUrl;
    }
}

class ClothingData {
    constructor() {
        this.items = [];
        this.addItem(1, "Nike Cortez", 90, "./assets/images/Sneakers/6f57ac9d331789699f9e341c89601121.jpg");
        this.addItem(2, "Штаны нефорские y2k", 200, "./assets/images/Pants/image.webp");
        this.addItem(3, "Цепочка Chrome Hearts", 6000, "./assets/images/Accessories/item-8550995e-b5a4-40f1-af24-5b98f494f3d6.jpg.webp");
        this.addItem(4, "Свитшот Marselin", 60, "./assets/images/Sweatshirt/86879511.png");
        this.addItem(5, "Цепочка Chrome Hearts", 1500, "./assets/images/Accessories/item-fd4665a6-0e4a-4629-9b95-f37933b7bf01.jpg.webp");
        this.addItem(6, "Свитшот Marselin", 60, "./assets/images/Sweatshirt/43131777.jpg");
        this.addItem(7, "Adidas Campus", 110, "./assets/images/Sneakers/HQ8708_1_238522ca-a0ac-4ce8-a726-e962fcfb1420.webp");
        this.addItem(8, "Balenciaga Track Sneaker", 1100, "./assets/images/Sneakers/13273832_54473592_1000.webp");
    }

    addItem(id, name, price, pictureUrl) {
        const newItem = new ClothingItem(id, name, price, pictureUrl);
        this.items.push(newItem);
    }

    getItems() {
        return this.items;
    }
}

let data = new ClothingData();

export default function GetClothes() {
    return data.getItems();
}

