-- Insert dummy grocery-related vendors
INSERT INTO vendors (name, email, phone, address, gst_number) 
VALUES ('Fresh Farms Produce', 'contact@freshfarms.com', '9876543210', '123 Agro Park, Bangalore 560001', 'GSTIN29AAFFF1234Z');

INSERT INTO vendors (name, email, phone, address, gst_number) 
VALUES ('Organic Harvest Co.', 'info@organicharvest.com', '8765432109', '456 Green Valley, Mumbai 400001', 'GSTIN27BOORG5678Y');

INSERT INTO vendors (name, email, phone, address, gst_number) 
VALUES ('Spice World Exports', 'sales@spiceworld.com', '7654321098', '789 Spice Market, Delhi 110001', 'GSTIN07CSPCE9012X');

INSERT INTO vendors (name, email, phone, address, gst_number) 
VALUES ('Daily Dairy Products', 'support@dailydairy.com', '6543210987', '321 Milk Colony, Chennai 600001', 'GSTIN33DDAIR3456W');

INSERT INTO vendors (name, email, phone, address, gst_number) 
VALUES ('Natures Basket Foods', 'eco@naturesbasket.com', '5432109876', '654 Organic Lane, Hyderabad 500001', 'GSTIN36ENBAS7890V');

INSERT INTO vendors (name, email, phone, address, gst_number) 
VALUES ('Premium Grains Supply', 'care@premiumgrains.com', '4321098765', '987 Grain Market, Pune 411001', 'GSTIN27FPGRA1234U');

INSERT INTO vendors (name, email, phone, address, gst_number) 
VALUES ('Freshly Packed Foods', 'help@freshpacked.com', '3210987654', '654 Packaging Zone, Kolkata 700001', 'GSTIN19GFPAK5678T');

INSERT INTO vendors (name, email, phone, address, gst_number) 
VALUES ('Sweet Treats Confectionery', 'info@sweettreats.co.in', '2109876543', '321 Sugar Lane, Ahmedabad 380001', 'GSTIN24HSTCF9012S');

INSERT INTO vendors (name, email, phone, address, gst_number) 
VALUES ('Frozen Foods Express', 'business@frozenfoods.com', '1098765432', '456 Cold Storage Road, Jaipur 302001', 'GSTIN08IFRZN3456R');

INSERT INTO vendors (name, email, phone, address, gst_number) 
VALUES ('Bulk Grocers Wholesale', 'orders@bulkgrocers.com', '0987654321', '789 Wholesale Market, Lucknow 226001', 'GSTIN09JBULK7890Q');

-- Fresh Farms Produce (Vendor ID: 1) Products
INSERT INTO products (name, description, price, vendor_id)
VALUES ('Fresh Tomatoes', 'Ripe red tomatoes, farm-picked daily', 45.50, 1);

INSERT INTO products (name, description, price, vendor_id)
VALUES ('Organic Potatoes', 'Premium quality, chemical-free potatoes', 35.75, 1);

INSERT INTO products (name, description, price, vendor_id)
VALUES ('Green Spinach Bundle', 'Fresh and crisp spinach leaves', 25.00, 1);

INSERT INTO products (name, description, price, vendor_id)
VALUES ('Red Onions', 'Medium-sized red onions, 1kg pack', 40.25, 1);

-- Organic Harvest Co. (Vendor ID: 2) Products
INSERT INTO products (name, description, price, vendor_id)
VALUES ('Organic Carrots', 'Fresh organic carrots grown without pesticides', 60.00, 2);

INSERT INTO products (name, description, price, vendor_id)
VALUES ('Organic Brown Rice', 'Naturally grown brown rice, 1kg pack', 120.50, 2);

INSERT INTO products (name, description, price, vendor_id)
VALUES ('Organic Quinoa', 'Premium quality organic quinoa, 500g pack', 180.75, 2);

INSERT INTO products (name, description, price, vendor_id)
VALUES ('Organic Mixed Vegetables', 'Assorted organic vegetables pack', 95.00, 2);

-- Spice World Exports (Vendor ID: 3) Products
INSERT INTO products (name, description, price, vendor_id)
VALUES ('Turmeric Powder', 'Premium ground turmeric, 100g pack', 55.50, 3);

INSERT INTO products (name, description, price, vendor_id)
VALUES ('Garam Masala', 'Authentic Indian spice blend, 50g pack', 65.25, 3);

INSERT INTO products (name, description, price, vendor_id)
VALUES ('Whole Black Pepper', 'Premium quality black peppercorns, 100g pack', 85.00, 3);

INSERT INTO products (name, description, price, vendor_id)
VALUES ('Cumin Seeds', 'Aromatic cumin seeds, 100g pack', 45.75, 3);

-- Daily Dairy Products (Vendor ID: 4) Products
INSERT INTO products (name, description, price, vendor_id)
VALUES ('Full Cream Milk', 'Fresh full cream milk, 1 liter pack', 60.00, 4);

INSERT INTO products (name, description, price, vendor_id)
VALUES ('Paneer Block', 'Fresh homemade cottage cheese, 200g pack', 80.50, 4);

INSERT INTO products (name, description, price, vendor_id)
VALUES ('Plain Yogurt', 'Creamy natural yogurt, 400g cup', 45.25, 4);

INSERT INTO products (name, description, price, vendor_id)
VALUES ('Butter Block', 'Pure dairy butter, 100g pack', 55.75, 4);

-- Natures Basket Foods (Vendor ID: 5) Products
INSERT INTO products (name, description, price, vendor_id)
VALUES ('Mixed Nuts Pack', 'Premium assorted nuts, 250g pack', 220.00, 5);

INSERT INTO products (name, description, price, vendor_id)
VALUES ('Dried Apricots', 'Sun-dried apricots, 150g pack', 125.50, 5);

INSERT INTO products (name, description, price, vendor_id)
VALUES ('Organic Honey', 'Raw unprocessed honey, 250g jar', 175.25, 5);

INSERT INTO products (name, description, price, vendor_id)
VALUES ('Trail Mix', 'Healthy mix of nuts, seeds, and dried fruits, 200g pack', 150.75, 5);

-- Premium Grains Supply (Vendor ID: 6) Products
INSERT INTO products (name, description, price, vendor_id)
VALUES ('Basmati Rice', 'Premium long-grain basmati rice, 1kg pack', 135.00, 6);

INSERT INTO products (name, description, price, vendor_id)
VALUES ('Wheat Flour', 'Stone-ground whole wheat flour, 5kg pack', 180.50, 6);

INSERT INTO products (name, description, price, vendor_id)
VALUES ('Rolled Oats', 'Traditional rolled oats, 500g pack', 95.25, 6);

INSERT INTO products (name, description, price, vendor_id)
VALUES ('Millet Mix', 'Mixed millets for healthy cooking, 1kg pack', 110.75, 6);

-- Freshly Packed Foods (Vendor ID: 7) Products
INSERT INTO products (name, description, price, vendor_id)
VALUES ('Poha Flakes', 'Flattened rice flakes, 500g pack', 65.00, 7);

INSERT INTO products (name, description, price, vendor_id)
VALUES ('Baked Beans', 'Ready-to-eat baked beans in tomato sauce, 400g can', 75.50, 7);

INSERT INTO products (name, description, price, vendor_id)
VALUES ('Instant Upma Mix', 'Ready-to-cook upma mix, 200g pack', 45.25, 7);

INSERT INTO products (name, description, price, vendor_id)
VALUES ('Cornflakes', 'Crispy corn flakes, 500g box', 120.75, 7);

-- Sweet Treats Confectionery (Vendor ID: 8) Products
INSERT INTO products (name, description, price, vendor_id)
VALUES ('Chocolate Chip Cookies', 'Crunchy cookies with real chocolate chips, 250g pack', 85.00, 8);

INSERT INTO products (name, description, price, vendor_id)
VALUES ('Assorted Candies', 'Mixed fruit-flavored candies, 150g pack', 55.50, 8);

INSERT INTO products (name, description, price, vendor_id)
VALUES ('Jelly Beans', 'Colorful assorted jelly beans, 100g pack', 65.25, 8);

INSERT INTO products (name, description, price, vendor_id)
VALUES ('Dark Chocolate Bar', 'Premium dark chocolate, 100g bar', 95.75, 8);

-- Frozen Foods Express (Vendor ID: 9) Products
INSERT INTO products (name, description, price, vendor_id)
VALUES ('Frozen Peas', 'Garden-fresh frozen peas, 500g pack', 75.00, 9);

INSERT INTO products (name, description, price, vendor_id)
VALUES ('Frozen Mixed Berries', 'Assorted frozen berries, 300g pack', 195.50, 9);

INSERT INTO products (name, description, price, vendor_id)
VALUES ('Frozen Pizza Base', 'Ready-to-top pizza bases, pack of 4', 125.25, 9);

INSERT INTO products (name, description, price, vendor_id)
VALUES ('Frozen French Fries', 'Crispy potato french fries, 500g pack', 85.75, 9);

-- Bulk Grocers Wholesale (Vendor ID: 10) Products
INSERT INTO products (name, description, price, vendor_id)
VALUES ('Refined Sugar', 'Fine white sugar, 5kg pack', 225.00, 10);

INSERT INTO products (name, description, price, vendor_id)
VALUES ('Toor Dal', 'Split pigeon peas, 2kg pack', 180.50, 10);

INSERT INTO products (name, description, price, vendor_id)
VALUES ('Mustard Oil', 'Pure mustard cooking oil, 1L bottle', 145.25, 10);

INSERT INTO products (name, description, price, vendor_id)
VALUES ('Chickpeas', 'Dried white chickpeas, 1kg pack', 130.75, 10);