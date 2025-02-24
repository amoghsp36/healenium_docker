-- Create schema explicitly (important!)
CREATE SCHEMA IF NOT EXISTS healenium AUTHORIZATION healenium_user;

-- Set default schema for this user
ALTER ROLE healenium_user SET search_path TO healenium;

-- Grant privileges at schema level
GRANT USAGE, CREATE ON SCHEMA healenium TO healenium_user;
GRANT ALL PRIVILEGES ON ALL TABLES IN SCHEMA healenium TO healenium_user;
GRANT ALL PRIVILEGES ON ALL SEQUENCES IN SCHEMA healenium TO healenium_user;

-- Ensure Liquibase runs in the correct schema
SET search_path TO healenium;

